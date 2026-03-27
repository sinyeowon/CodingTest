n, m = map(int, input().split())

a = []
b = []

for row in range(n):
    col = list(map(int, input().split()))
    a.append(col)
    
for row in range(n):
    col = list(map(int, input().split()))
    b.append(col)

for row in range(n):
    for col in range(m):
        print(a[row][col] + b[row][col], end=" ")
    print()