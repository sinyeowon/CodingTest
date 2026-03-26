n, m = map(int, input().split())

arr = [num+1 for num in range(n)]

for _ in range(m):
    i, j = map(int, input().split())
    temp = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = temp
    
print(*arr)