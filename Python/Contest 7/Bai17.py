n, k = map(int, input().split())
a = [int(x) for x in input().split()]
a.sort()

count = [0] * 10**6
for i in a:
    count[i] += 1

total = 0
for i in a:
    j = k-i
    if (count[j] > 0):
        if (i == j):
            if (count[j] > 1):
                total += count[j] - 1
                count[j] -= 1
        elif (i < j):
            total += count[j]
            
    

print(total)