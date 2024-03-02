n, k = map(int, input().split())
a = [int(x) for x in input().split()]
a.sort()

index = [0]*1000001
for i in range(n):
    index[a[i]] = i
y = 0
for i in range(len(index)):
    if (index[i] == 0):
        index[i] = y
    else:
        y = index[i]

count = 0
for i in range(n):
    if (a[i]*2 >= k):
        break
    else:
        count += (index[k-1-a[i]]-i)

print(count)
