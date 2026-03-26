n, m = map(int, input().split())
arr = [num for num in range(1, n+1)]

for k in range(m):
    i, j = map(int, input().split())
    i -= 1
    j -= 1
    
    while i < j:
        arr[i], arr[j] = arr[j], arr[i]
        i += 1
        j -= 1
        
print(*arr)