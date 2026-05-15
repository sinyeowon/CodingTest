import math

def solution(brown, yellow):
    answer = []
    
    divisor = []
    for i in range(1, yellow + 1):
        if yellow % i == 0:
            divisor.append(i)
    for i in divisor:
        n_col = yellow / i
        n_row = i
        if n_col*2 + (n_row+2)*2 == brown:
            r_col = n_col + 2
            r_row = i + 2
            break
    
    answer = [r_col, r_row]
    
    return answer