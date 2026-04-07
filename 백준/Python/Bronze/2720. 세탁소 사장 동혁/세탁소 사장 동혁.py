n = int(input())

for _ in range(n):
    money = int(input())
    
    q = money//25
    money %= 25
    d = money//10
    money %= 10
    ni = money//5
    money %= 5
    p = money
    
    print(q, d, ni, p)