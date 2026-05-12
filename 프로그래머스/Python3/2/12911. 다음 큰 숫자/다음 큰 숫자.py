def solution(n):
    answer = 0
    
    search = n
    while True:
        search += 1
        if bin(search)[2:].count("1") == bin(n)[2:].count("1"):
            answer = search
            break
    
    return answer