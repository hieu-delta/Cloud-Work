n = int(input())
a = [int (x) for x in input().split()]

stack = []
stack.append(a[0])
for i in range(1, n):
    if (len(stack) == 0):
        stack.append(a[i])
    else:
        sum = stack[len(stack) - 1] + a[i]
        if (sum % 2 ==0):
            stack.pop()
        else:
            stack.append(a[i])

print(len(stack))