n = int(input())
score = list(map(int, input().split()))

m  = max(score)
total = 0
for k in score:
    total += (k/m*100)

print(total/n)