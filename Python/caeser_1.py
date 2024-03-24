c = "Li qex Geiwev"
c = "Gd lzs Bzdrdq"
c = c.lower()
for i in range(0,26):
    print(str(i)+". ",end="")
    for j in c:
        if (j != " "):
            x = i+ord(j)
            if (x > 122):
                x = 96 + x%122
            print(chr(x), end="")
        else: print(j, end="")
    print()
    