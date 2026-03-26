import sys

while True:
    line = sys.stdin.readline()
    
    if not line:
        break
    else:
        a, b = map(int, line.split())
        print(a+b)