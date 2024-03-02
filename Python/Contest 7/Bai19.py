n, k = map(int, input().split())
a = [int(x) for x in input().split()]
a.sort()

index = [0] * 1000001
for i in range(n):
    index[a[i]] = i

y = n-1
for i in reversed(range(a[1], 1000001)):
    if (index[i] == 0):
        index[i] = y
    else:
        y = index[i]

count = 0
for i in reversed(range(n)):
    if (a[i]*2 <= k):
        break
    else:
        if (a[i] >= k):
            count += i
        else:
            count += (i-index[k+1-a[i]])

print(count)