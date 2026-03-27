n = int(input())

for _ in range(n):
    stack = []
    s = input()
    check = True
    
    for ch in s:
        if ch == '(':
            stack.append(ch)
        else:
            if not stack:
                check = False
                break
            stack.pop()
    if not stack and check:
          print("YES")
    else:
          print("NO")
        
        