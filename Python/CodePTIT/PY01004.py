import math

for t in range(int(input())):
    n = int(input())
    count = 0
    for i in range(1,n):
        if (math.gcd(i,n) == 1):
            #print(math.gcd(i,n))
            count += 1
    def check(n):
        for i in range(2,int(math.sqrt(n))+1):
            if (n % i == 0):
                return 0
        return 1
    #print(count)
    if (check(count) == 0 or count < 2):
        print("NO")
    else: print("YES")
    