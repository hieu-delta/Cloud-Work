a, b, c = map(int, input().split())

case1 = a + b + c
case2 = a*2 + c*2 
case3 = b*2 + c*2
case4 = a*2 + b*2
way = min(case1, case2, case3, case4)

print(way)