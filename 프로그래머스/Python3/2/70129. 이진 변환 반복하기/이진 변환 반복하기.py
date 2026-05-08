def solution(s):
    answer = []
    z_cnt = 0
    cnt = 0
    
    while True:
        
        if len(s) == 1 and s[0] == '1':
            break
        
        z_cnt += s.count('0')
        s = s.replace("0", "")
        num = len(s)
        
        arr = []
        while num != 0:
            arr.append(str(num%2))
            num = num//2
        
        arr.reverse()
        s = ''.join(arr)
        cnt += 1
    
    answer.append(cnt)
    answer.append(z_cnt)
    
    
    return answer