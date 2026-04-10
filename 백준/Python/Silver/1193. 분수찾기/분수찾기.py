n = int(input())

line = 1
idx = 2

while n > line:
    line += idx
    idx += 1
    
if (idx-1) % 2 == 0:
    print("%d/%d" % (((idx-1)-(line - n), (line - n) + 1)))
else:
    print("%d/%d" % (((line - n) + 1), (idx-1)-(line - n)))