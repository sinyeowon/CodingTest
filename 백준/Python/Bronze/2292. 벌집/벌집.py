n = int(input())

cnt = 1
check = 1

while n > check:
    check += 6*cnt
    cnt += 1
    
print(cnt)