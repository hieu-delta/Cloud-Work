from functools import cmp_to_key

def digit_total(n):
    total = 0
    s = str(n)
    for i in s:
        total+=int(i)
    return total

def compare(a, b):
    sum1 = digit_total(a)
    sum2 = digit_total(b)
    if (sum1==sum2):
        return a-b
    else:
        return sum1-sum2

n = int(input())
a = [int(x) for x in input().split()]

a.sort(key=cmp_to_key(compare))
for i in a:
    print(i, end=" ")