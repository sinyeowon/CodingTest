chess = [1, 1, 2, 2, 2, 8]

find = list(map(int, input().split()))

result = []
for i in range(6):
    result.append(chess[i]-find[i])
    
print(*result)