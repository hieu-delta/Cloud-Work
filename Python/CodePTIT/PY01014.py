a, k, n = map(int, input().split())
r = n - a 
l = (a//k + 1)*k - a

if (l > r):
    print (-1)
else:
    for i in range(l,r+1,k):
        print(i, end=" ")
    print()
