def check1(n):
    n = str(n)
    for i in n:
        if (int(i) % 2 != 0):
            return 0;
    if (len(n) % 2 == 1):
        return 0
    for i in range(len(n)//2):
        if (n[i] != n[len(n)-1-i]):
            return 0;
    return 1

for t in range(int(input())):
    n = int(input())
    for i in range(22,n):
        if (check1(i) == 1):
            print(i, end=" ")
    print()