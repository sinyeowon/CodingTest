arr = [0 for _ in range(26)]

s = input().upper()
for ss in s:
    arr[ord(ss) - ord('A')] += 1
    
n = max(arr)
cnt = 0
for id in arr:
    if id == n:
        iidex = arr.index(id)
        cnt += 1
if cnt > 1:
    print("?")
else: print(chr(iidex + ord('A')))