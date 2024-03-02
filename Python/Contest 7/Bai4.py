n = int(input())

a = [int(x) for x in input().split()]
a.sort()
b = [-1]

for i in range(1, len(a)):
    b.append(a[i]-a[i-1])

b.sort()
print(b[1])