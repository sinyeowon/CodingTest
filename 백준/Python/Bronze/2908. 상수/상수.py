arr = input().split()

total = []
for num in arr:
    num = int(num)
    total.append(num%10*100 + (num%100-(num%10)) + num//100)

print(max(total))