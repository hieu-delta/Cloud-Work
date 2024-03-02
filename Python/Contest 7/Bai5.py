n = int(input())
a = [int(x) for x in input().split()]
count = [1] * n
a.sort()

d=1
for i in range(1, len(a)):
    if (a[i] == a[i-1]):
        d+=1
    else:
        count[i-1] = d
        d = 1
if (d>1):
    count[len(a)-1] = d

max = 1
pos = 0
for i in range(len(a)):
    if (count[i] > max):
        max = count[i]
        pos = i

print(a[pos], max)

