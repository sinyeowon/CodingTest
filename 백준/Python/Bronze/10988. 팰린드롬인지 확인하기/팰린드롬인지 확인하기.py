s = input()

check = True

for i in range(len(s)//2):
    if s[i] != s[-(i+1)]:
        check = False
        break
        
if check:
    print("1")
else:
    print("0")