for t in range(int(input())):
    s1 = input()
    s2 = "".join(reversed(s1))
    for i in range(len(s1)):
        if (i == len(s1) - 1):
            print("YES")
        else:
            if (abs(ord(s1[i]) - ord(s1[i+1])) != abs(ord(s2[i]) - ord(s2[i+1]))):
                print("NO")
                break