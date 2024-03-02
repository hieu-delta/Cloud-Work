t = int(input())
for i in range(t):
    p, q = input().split()
    list = input().split()
    if (len(list) == 1):
        x1 = list[0]
        x2 = input()
    else:
        x1, x2 = list
    n1 = int(x1.replace(p, q)) + int(x2.replace(p, q))
    n2 = int(x1.replace(q, p)) + int(x2.replace(q, p))
    print(min(n1, n2), max(n1, n2))



