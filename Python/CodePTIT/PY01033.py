import math

l, r = map(int, input().split())
a = [x for x in range(l,l+3)]
a[2] = a[1]
i = 2
while(i >= 0):
    while(i>=0 and a[i] == r-2+i):
        i -= 1
    a[i] += 1
    if (i >= 0):
        for j in range(i+1,3):
            a[j] = a[j-1] + 1
        if (math.gcd(a[0],a[1]) == 1 and math.gcd(a[1],a[2]) == 1 and math.gcd(a[0],a[2]) == 1):
            print("(" + str(a[0]) + ", " + str(a[1]) +", " + str(a[2]) + ")")
        i = 2

