n = int(input())
d=0

while(n>=100):
    d+=1
    n=n-100

while(n>=20):
    d+=1
    n=n-20

while(n>=10):
    d+=1
    n=n-10

while(n>=5):
    d+=1
    n=n-5

print(n+d)