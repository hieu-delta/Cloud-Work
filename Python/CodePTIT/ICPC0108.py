for t in range(int(input())):
    n = int(input())
    a = [int (x) for x in input().split()]
    a.sort()
    count = 0
    for i in range(n-2):
        if (a[i] >= 0):
            break
        l = i + 1
        r = n - 1
        while (l < r):
            temp = a[i] + a[l] + a[r]
            if (temp < 0):
                l += 1
            elif (temp > 0):
                r -= 1
            else:
                count += 1
                l += 1
    print(count)

