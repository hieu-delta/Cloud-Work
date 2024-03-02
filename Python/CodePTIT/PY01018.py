while(1):
    p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."
    s = input()
    if (s == "0"):
        break
    else:
        k,s = s.split()
    k = int(k)
    ss = ""
    for i in range(len(s)):
        ss += p[(p.find(s[i]) + k) % 28]
    print("".join(reversed(ss)))

    