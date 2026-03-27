s = input()

for i in range(97, 123):
    cnt = 0
    for ss in s:
        if ss == chr(i):
            cnt += 1
            print(s.index(ss), end=" ")
            break
    if cnt == 0:
        print("-1", end=" ")