def solution(operations):
    answer = []
    arr = []
    
    for line in operations:
        if line[0] == "I":
            arr.append(int(line[2:]))
        elif line == "D 1":
            if arr:
                arr.pop(arr.index(max(arr)))
        else:
            if arr:
                arr.pop(arr.index(min(arr)))
            
    if not arr:
        answer = [0, 0]
    else:
        answer.append(max(arr))
        answer.append(min(arr))
    
    return answer