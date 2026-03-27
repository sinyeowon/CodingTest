arr = [list(map(int, input().split())) for _ in range(9)]

max_val = arr[0][0]
r = 0
c = 0
for row in range(9):
    for col in range(9):
        if arr[row][col] > max_val:
            max_val = arr[row][col]
            r = row
            c = col
            
print("%d\n%d %d" %(max_val, r+1, c+1))