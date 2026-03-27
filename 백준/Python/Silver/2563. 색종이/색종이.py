n = int(input())
arr = [[0]*100 for _ in range(100)]

for _ in range(n):
    a, b = map(int, input().split())
    
    for row in range(b, b+10):
        for col in range(a, a+10):
            arr[row][col] = 1
            
cnt = 0
for i in range(100):
    cnt += arr[i].count(1)
    
print(cnt)