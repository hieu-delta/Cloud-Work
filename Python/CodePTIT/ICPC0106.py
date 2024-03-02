t = int(input())
while(t > 0):
    t -= 1
    k = int(input())
    s = input()
    n = int(s, 2)
    a = []
    def convert(n, k):
        while(n > 0):
            r = n % k
            n = n // k
            if (r > 9):
                a.append(chr(r+55))
            else:
                a.append(r)
    if (k == 2):
        print(s)
    else:
        convert(n, k)
        for i in reversed(a):
            print(i, end="")
        print()
