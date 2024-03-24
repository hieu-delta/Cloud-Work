c = "oow"
count=1
for i in range(1,26):
    for j in range(1,26):
        for k in range(1,26):
            print(count,end=". ")
            count+=1
            print("k",end="")
            x = ord(c[0]) - i
            if (x < 97):
                x = 123 - (97-x)
            print(chr(x),end="")
            x = ord(c[1]) - j
            if (x < 97):
                x = 123 - (97-x)
            print(chr(x),end="")
            x = ord(c[2]) - k
            if (x < 97):
                x = 123 - (97-x)
            print(chr(x),end="")
            print("u")