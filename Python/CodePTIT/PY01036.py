for t in range(int(input())):
    n = int(input())
    start = 1
    if (n%2 == 0):
        start += 1
    print("%.6f" %sum(1/i for i in range(start,n+1,2)))