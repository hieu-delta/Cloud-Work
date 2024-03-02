for t in range(int(input())):
    n = input()
    check = 1
    total = sum(int(x) for x in n)
    if (total % 10 != 0):
        check = 0
    else:
        s = list(n)
        for i in range(len(s)-1):
            if (abs(int(s[i]) - int(s[i+1])) != 2):
                check = 0
                break      
    if (check == 1):
        print("YES")
    else:
        print("NO")      
        