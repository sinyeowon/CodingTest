number = ['0', '0', 'ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

s = input()

total = 0
for w in s:
    for n in number:
        if w in n:
            total += (number.index(n)+1)
            break

print(total)