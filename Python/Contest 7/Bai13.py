n = int(input())
a = [int(x) for x in input().split()]
count = [1] * n

a.sort()
for i in range(1, len(a)):
    if (a[i] >= count[i-1]):
        count[i] = count[i-1] + 1

print(count[n-1])

