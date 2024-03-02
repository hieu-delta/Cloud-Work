s = input()
new_s = ""
#new_s = s[len(s)-3:]
for i in range(len(s)-3,(len(s)%3)-1,-3):
    new_s = (s[i:i+3]) + "," + new_s
if (len(s) % 3 != 0):
    new_s = s[:len(s)%3] + "," + new_s
print(new_s[:-1])