import math
import heapq

# Define the Cell class
class Cell:
	def __init__(self):
		self.parent_i = 0 # Parent cell's row index
		self.parent_j = 0 # Parent cell's column index
		self.f = float('inf') # Total cost of the cell (g + h)
		self.g = float('inf') # Cost from start to this cell
		self.h = 0 # Heuristic cost from this cell to goal

# Define the size of the grid
ROW = 8
COL = 10

# Check if a cell is valid (within the grid)
def is_valid(row, col):
	return (row >= 0) and (row < ROW) and (col >= 0) and (col < COL)

# Check if a cell is unblocked
def is_unblocked(grid, row, col):
	return grid[row][col] == 1

# Check if a cell is the goal
def is_goal(row, col, goal):
	return row == goal[0] and col == goal[1]

# Calculate the heuristic value of a cell (Euclidean distance to goal)
def calculate_h_value(row, col, goal):
	return ((row - goal[0]) ** 2 + (col - goal[1]) ** 2) ** 0.5

# Trace the path from source to goal
def trace_path(cell_details, src, goal, path_grid):
	print("A* Path From (" + str(src[0]) + "," + str(src[1]) + ") To (" + str(goal[0]) + "," + str(goal[1]) + "):")
	path = []
	row = goal[0]
	col = goal[1]

	# Trace the path from goal to source using parent cells
	while not (cell_details[row][col].parent_i == row and cell_details[row][col].parent_j == col):
		path.append((row, col))
		path_grid[row][col] = 7
		temp_row = cell_details[row][col].parent_i
		temp_col = cell_details[row][col].parent_j
		row = temp_row
		col = temp_col

	# Add the source cell to the path
	path.append((row, col))
	path_grid[row][col] = 7
	# Reverse the path to get the path from source to goal
	path.reverse()
	# Print the path
	print(path[0], end=" ")
	for i in range(1,len(path)):
		print("->", path[i], end=" ")
	print()

	# Print the path in gird view
	print("Grid View With 7-Path:")
	for x in path_grid:
		print(x)

# Implement the A* search algorithm
def a_star_search(grid, src, goal, beta):
	# Initialize threshold
	limit = 0

	# Duplicate the original grid
	path_grid = grid

	# Initialize the ordered visited cells list  
	visited_cells = []
	visited_cells.append((src[0],src[1]))

	# Check if the source and goal are valid
	if not is_valid(src[0], src[1]) or not is_valid(goal[0], goal[1]):
		print("Source or goal is invalid!")
		return

	# Check if the source and goal are unblocked
	if not is_unblocked(grid, src[0], src[1]) or not is_unblocked(grid, goal[0], goal[1]):
		print("Source or the goal is blocked!")
		return

	# Check if we are already at the goal
	if is_goal(src[0], src[1], goal):
		print("We are already at the goal!")
		return

	# Initialize the closed list (visited cells)
	closed_list = [[False for _ in range(COL)] for _ in range(ROW)]
	# Initialize the details of each cell
	cell_details = [[Cell() for _ in range(COL)] for _ in range(ROW)]

	# Initialize the start cell details
	i = src[0]
	j = src[1]
	cell_details[i][j].f = 0
	cell_details[i][j].g = 0
	cell_details[i][j].h = 0
	cell_details[i][j].parent_i = i
	cell_details[i][j].parent_j = j

	# Initialize the open list (cells to be visited) with the start cell
	open_list = []
	heapq.heappush(open_list, (0.0, i, j))
	# Initialize the pruned nodes
	pruned_nodes = []
	# Initialize the flag for whether goal is found
	found_goal = False

	# Main loop of A* search algorithm
	while len(open_list) > 0:
		# Pop the cell with the smallest f value from the open list
		p = heapq.heappop(open_list)

		# Mark the cell as visited
		i = p[1]
		j = p[2]
		closed_list[i][j] = True

		# For each direction, check the successors
		directions = [(0, 1), (0, -1), (1, 0), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
		for dir in directions:
			new_i = i + dir[0]
			new_j = j + dir[1]
			# Calculate the new f, g, and h values
			g_new = cell_details[i][j].g + 1.0
			h_new = calculate_h_value(new_i, new_j, goal)
			f_new = g_new + h_new
			# If the successor is valid, unblocked, and not visited
			if is_valid(new_i, new_j) and is_unblocked(grid, new_i, new_j) and not closed_list[new_i][new_j]:
				# Append visited cell to the visited list
				visited_cells.append((new_i,new_j))
				# If the successor is the goal
				if is_goal(new_i, new_j, goal):
					# Set the parent of the goal cell
					path_grid[new_i][new_j] = 5
					cell_details[new_i][new_j].parent_i = i
					cell_details[new_i][new_j].parent_j = j
					print("Path available!")
					# Print all visited cells
					print("Visited cells:")
					print(visited_cells[0], end="  ")
					for x in range(1,len(visited_cells)):
						if (x%10 == 0):
							print()
						print(visited_cells[x], end="  ")
					print()
					# Trace and print the path from source to goal
					trace_path(cell_details, src, goal, path_grid)
					found_goal = True
					return
				else:
					# If the cell is not in the open list or the new f value is smaller
					if cell_details[new_i][new_j].f == float('inf') or cell_details[new_i][new_j].f > f_new:
						# Add the cell to the open list
						if (f_new <= limit):
							heapq.heappush(open_list, (f_new, new_i, new_j))
						else:
							closed_list[new_i][new_j] = True
							pruned_nodes.append(p)
						# Update the cell details
						cell_details[new_i][new_j].f = f_new
						cell_details[new_i][new_j].g = g_new
						cell_details[new_i][new_j].h = h_new
						cell_details[new_i][new_j].parent_i = i
						cell_details[new_i][new_j].parent_j = j
	
	# If the goal is not found after visiting all cells
	if not found_goal:
		print("Failed to find the goal cell!")

def main():
	# Define the grid (1 for unblocked, 0 for blocked)
	grid = [
		#0  1  2  3  4  5  6  7  8  9
		[1, 1, 1, 1, 1, 1, 1, 1, 1, 1], #0
		[1, 0, 0, 0, 0, 0, 1, 1, 1, 1], #1
		[1, 1, 1, 1, 0, 0, 0, 0, 1, 1], #2
		[1, 1, 1, 1, 1, 1, 1, 0, 1, 1], #3
		[1, 1, 1, 1, 0, 0, 0, 0, 1, 1], #4
		[1, 0, 0, 0, 0, 0, 1, 1, 1, 1], #5
		[1, 1, 1, 1, 1, 1, 1, 1, 1, 1], #6
		[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]  #7
	]
	for i in grid:
		print(i)
	# Define the source and goal
	x1, y1 = map(int,input("Start cell index: ").split())
	src = [x1,y1]
	x2, y2 = map(int,input("Goal cell index: ").split())
	goal = [x2,y2]
	beta = int(input("Jump: "))
	# Run the A* search algorithm
	a_star_search(grid, src, goal, beta)

if __name__ == "__main__":
	main()
