total = int(input())
num = int(input())

rtotal = 0

for i in range(num):
    price, item = input().split()
    price, item = int(price), int(item)
    
    rtotal += price * item
    
if rtotal == total:
    print("Yes")
else: print("No")