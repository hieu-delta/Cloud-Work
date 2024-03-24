def check(n):
    if (len(n) < 3):
        return "NO"
    for i in range(1,len(n)):
        if (n[i-1] == n[i]):
            return "NO"
        elif (n[i-1] > n[i]):
            for j in range(i,len(n)-1):
                if (n[i] <= n[i+1]):
                    return "NO"
    return "YES"

for t in range(int(input())):
    n = input()
    print(check(n))