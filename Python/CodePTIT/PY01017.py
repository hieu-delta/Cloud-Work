for t in range(int(input())):
    s = input()
    count = 1
    s = s + " "
    for i in range(1,len(s)):
        if (s[i] == s[i-1]):
            count += 1
        else:
            print(str(count) + s[i-1], end="")
            count = 1
    print()