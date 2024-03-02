a, b = map(int, input().split())

if (a%2==0):
    x = int(a/2)
else:
    x = int(a/2 +1)

if (b > a):
    print(-1)
else:
    for i in range (x, a+1, 1):
        if (i % b == 0):
            print(i)
            break