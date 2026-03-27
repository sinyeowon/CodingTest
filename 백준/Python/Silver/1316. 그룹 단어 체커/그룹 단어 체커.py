n = int(input())

cnt = 0
for i in range(n):
    check = [0] * 26
    s = input()
    
    rp = -1
    result = True
    for ss in s:
        idx = ord(ss) - ord('a')
        if check[idx] != 0 and rp != idx:
            result = False
            break
        check[idx] += 1
        rp = idx
    if result:
        cnt += 1
        
print(cnt)