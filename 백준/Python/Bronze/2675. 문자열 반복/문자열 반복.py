n = int(input())

for i in range(n):
    a, b = input().split()
    a = int(a)
    
    for j in b:
        print(j*a, end="")
    print()
    