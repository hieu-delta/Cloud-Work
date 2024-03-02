import sys

count = [2] * (10**8+1)
check = [0] * (10**8+1)
count[1] = check[1] = 1
count[0] = 0
max = 1
j = 0
for i in range(2,10**8+1):
    j = 2
    while(i*j <= 10**8):
        count[i*j] += 1
        j += 1
    if (count[i] > max):
        max = count[i]
        check[i] = 1

# check = [1, 2, 4, 6, 12, 24, 36, 48, 60, 120, 180, 240, 360, 720, 840, 1260, 1680, 2520, 5040, 7560, 10080, 15120, 20160, 25200, 27720, 45360, 50400, 55440, 83160, 110880, 166320, 221760, 277200, 332640, 498960, 554400, 665280, 720720, 1081080, 1441440, 2162160, 2882880, 3603600, 4324320, 6486480, 7207200, 8648640, 10810800]

t = int(input())
i = 0
print("start")
for line in sys.stdin:
    n = int(line)
    for j in range(n,10**8+1):
        if (check[j] == 1):
            print(j)
            break
    i += 1
    if (i == t): break