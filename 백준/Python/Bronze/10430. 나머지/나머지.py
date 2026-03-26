a, b, c = input().split()
a, b, c = int(a), int(b), int(c)

print("%d\n%d\n%d\n%d" % ((a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c))