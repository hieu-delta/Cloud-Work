import math

def isprime(n):
    if (n == 1 or n == 0):
        return 0
    for i in range(2,int(math.sqrt(n))+1):
        if (n % i == 0):
            return 0
    return 1

def count(n):
    n = str(n)
    sum = 0
    for i in n:
        sum += int(i)
    return isprime(sum)

for t in range(int(input())):
    n, m = map(int,input().split())
    if (count(math.gcd(n,m)) == 1):
        print("YES")
    else: print("NO")
