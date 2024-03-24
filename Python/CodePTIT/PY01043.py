def check(s):
    s = str(s)
    if (len(s)%2 != 0):
        return 0
    for i in range(len(s)//2):
        if (int(s[i])%2 != 0 or int(s[len(s)-1-i])%2 != 0 or s[i]!=s[len(s)-1-i]):
            return 0
    return 1
    
a = [0] * 1000001
for x in range(len(a)):
    a[x] = check(x)

for t in range(int(input())):
    n = int(input())
    for i in range(22,n+1):
        if (a[i] == 1):
            print(i, end=" ")
    print()

