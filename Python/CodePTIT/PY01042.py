def check(s):
    if (s.count('0') + s.count('1') + s.count('2') == len(s)):
        return "YES"
    else: return "NO"
for t in range(int(input())):
    s = input()
    print(check(s))