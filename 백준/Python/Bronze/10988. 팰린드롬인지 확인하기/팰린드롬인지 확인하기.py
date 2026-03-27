s = input()

cnt = 0
if len(s) == 1:
    print("1")
for i in range(len(s)//2):
    if s[i] != s[-(i+1)]:
        print("0")
        break
    cnt += 1
    if cnt == (len(s)//2):
        print("1")
    