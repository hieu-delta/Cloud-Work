import math

for t in range(int((input()))):
    n1 = input()
    n2 = int(n1[::-1])
    n1 = int(n1)
    if (math.gcd(n1,n2) == 1):
        print("YES")
    else: print("NO")
