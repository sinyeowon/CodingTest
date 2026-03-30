from collections import deque

num_list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = deque()

n, b = map(int, input().split())

while(n > 0):
    result.appendleft(num_list[n%b])
    n = n//b
    
print(''.join(result))