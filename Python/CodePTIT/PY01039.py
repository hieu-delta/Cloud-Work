for t in range(int(input())):
    s = input()
    s1 = str([s[x] for x in range(len(s)) if (x%2==0)])
    s2 = str([s[x] for x in range(len(s)) if (x%2!=0)])
    print(s1,s2)