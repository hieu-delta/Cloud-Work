for t in range(int(input())):
    n = int(input())
    s = input().strip()
    s = " " + s + " "
    min1 = min2 = min3 = 100000000
    
    i = 0
    while(i < len(s) - 1):
        if (s[i] == " "):
            j = i+1
            while(s[j] != " "):
                j += 1
            temp = int(s[i:j])
            if (temp < min1):
                min3 = min2
                min2 = min1
                min1 = temp
            elif (temp < min2):
                min3 = min2
                min2 = temp
            elif (temp < min3):
                min3 = temp
            i = j
                
    print(min1 + min2 + min3)
