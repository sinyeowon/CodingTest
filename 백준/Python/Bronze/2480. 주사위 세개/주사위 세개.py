a, b, c = input().split()
a, b, c = int(a), int(b), int(c)

if (a == b) and (b == c):
    print(10000 + a*1000)
elif (a == b) or (b == c) or (a == c):
    if (a == b): print(1000 + a*100)
    elif (b == c): print(1000 + b*100)
    else: print(1000 + a*100)
else:
    large = 0
    for num in a, b, c:
        if num > large:
            large = num
    print(large * 100)