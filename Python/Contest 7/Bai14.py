n = int(input())
a = [int (x) for x in input().split()]
a.sort(reverse=True)

sum = 0
for i in range(n):
    if (a[i] >= i):
        sum += a[i] - i

print(sum)
