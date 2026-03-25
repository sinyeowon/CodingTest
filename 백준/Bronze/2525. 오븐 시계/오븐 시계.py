h, m = input().split()
h, m = int(h), int(m)

cook = input()
cook = int(cook)

if (m+cook) >= 60:
    if h+((m+cook)//60) > 23:
        print("%d %d" %((h+((m+cook)//60))-24, (m+cook)%60))
    else:
        print("%d %d" %(h+((m+cook)//60), (m+cook)%60))
else:
    print("%d %d" %(h, m+cook))