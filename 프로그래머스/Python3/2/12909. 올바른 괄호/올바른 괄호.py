def solution(s):
    answer = True
    
    arr = []
    
    for i in range(len(s)):
            
        if i == 0:
            if s[0] == ')':
                answer = False
                break
        
        if s[i] == '(':
            arr.append(s[i])
        else:
            if not arr:
                answer = False
                break
            else:
                arr.pop()
                
        if i == len(s)-1:
            if arr:
                answer = False
                break
    

    return answer