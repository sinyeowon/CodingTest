n = int(input())
arr = list(map(int, input().split()))

min_val = 1000000
max_val = -1000000

for num in arr:
    if num < min_val:
        min_val = num
    if num > max_val:
        max_val = num
        
print("%d %d" %(min_val, max_val))