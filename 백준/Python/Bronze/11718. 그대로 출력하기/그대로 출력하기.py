import sys

arr = []

for line in sys.stdin:
    arr.append(line.rstrip())

for i in range(len(arr)):
    print(arr[i])