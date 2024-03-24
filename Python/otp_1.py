c = "blwp"
k1 = "fhwy"
k2 = "iesr"
m1 = ""
m2 = ""
for i in range(len(c)):
    x1 = ord(c[i]) - ord(k1[i])%97
    if (x1 < 97):
        x1 = 123 - (97-x1)
    m1 += chr(x1)
    x2 = ord(c[i]) - ord(k2[i])%97
    if (x2 < 97):
        x2 = 123 - (97-x2)
    m2 += chr(x2)
print(m1,m2)