h, m = input().split()
h, m = int(h), int(m)

if m < 45:
    if h > 0:
        print("%d %d" %(h-1, 60-(45-m)))
    else:
        print("%d %d" %(23, 60-(45-m)))
else:
    print("%d %d" %(h, m-45))