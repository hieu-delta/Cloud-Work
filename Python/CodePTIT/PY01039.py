def check(s):
    if (len(s) < 2):
        return "NO"
    for i in range(2,len(s)):
        if (s[i] != s[i-2]):
            return "NO"
    for i in range(3,len(s)):
        if (s[i] != s[i-2]):
            return "NO"
    return "YES"
for t in range(int(input())):
    s = input()
    print(check(s))