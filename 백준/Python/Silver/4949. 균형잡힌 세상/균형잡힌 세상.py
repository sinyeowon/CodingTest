import sys

while True:
    word = sys.stdin.readline().rstrip('\n')

    if word == '.':
        break

    stack = []
    ok = True

    for ch in word:
        if ch == '(' or ch == '[':
            stack.append(ch)
        elif ch == ')':
            if not stack or stack[-1] != '(':
                ok = False
                break
            stack.pop()
        elif ch == ']':
            if not stack or stack[-1] != '[':
                ok = False
                break
            stack.pop()

    if ok and not stack:
        print("yes")
    else:
        print("no")