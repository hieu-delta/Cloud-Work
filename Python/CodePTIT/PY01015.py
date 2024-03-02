for t in range(int(input())):
    s = input()
    s = s[0] + s
    for i in range(1,len(s)):
        if (int(s[i]) < int(s[i-1])):
            print("NO")
            break
        elif (i == len(s) - 1):
            print("YES")