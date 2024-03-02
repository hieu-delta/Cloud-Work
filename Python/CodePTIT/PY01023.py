prime_check = [1]*1000001
for i in range(2,len(prime_check)):
    if (prime_check[i] == 1):
        j = 2
        while(i*j < len(prime_check)):
            prime_check[i*j] = 0
            j += 1

for t in range(int(input())):
    n = int(input())
    print("1", end=" ")
    while(n > 1):
        count = 0
        for i in range(2,len(prime_check)):
            if (prime_check[i] == 1):
                while(n % i == 0):
                    count += 1
                    n //= i
            if (count > 0):
                print("* " + str(i) + "^" + str(count), end=" ")
                count = 0
            if (n == 1):
                break
    print()
            
