s = input()
d1 = d2 = 0
for i in s:
    if (i >= 'a' and i <= 'z'):
        d1 += 1
    else: d2 += 1

if (d1 >= d2):
    print(s.lower())
else: print(s.upper())