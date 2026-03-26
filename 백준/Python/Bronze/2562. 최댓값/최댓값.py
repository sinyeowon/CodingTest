arr = []

for i in range(9):
    arr.append(int(input()))
    
mmax = arr[0]
for i in range(9):
    if arr[i] >= mmax:
        mmax = arr[i]
        num = i+1

print("%d\n%d" %(mmax, num))