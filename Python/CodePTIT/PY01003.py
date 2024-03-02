import math


for t in range(int(input())):
    s = input()
    n = int(s)
    for i in range(1,len(s)):
        m = 10**i
        n = n/m
        if (n % 1 >= 0.5):
            n = math.ceil(n)*m
        else: n = math.floor(n)*m
    print(n)