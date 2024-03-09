for t in range(int(input())):
    n = int(input())
    count = 0
    while(n%7 != 0 and count <= 1000):
        count += 1
        n += int(str(n)[::-1])
    if (count == 1000):
        print(-1)
    else: print(n)