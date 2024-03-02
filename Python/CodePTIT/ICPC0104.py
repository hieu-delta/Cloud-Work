t = int(input())

while(t>0):
    t -= 1
    s = input()
    list = []
    temp = ""
    for i in s:
        if (i.isdigit() == True):
            temp += i
        else:
            temp += " "
    list = [int (x) for x in temp.split()]
    list.sort()
    print(list[0])
