from collections import deque

def solution(begin, target, words):
    answer = 0
    
    if target not in words:
        answer = 0
    else:
        queue = deque([(begin, 0)])
        visited = set([begin])
        
        while queue:
            current_word, step = queue.popleft()
            
            if current_word == target:
                answer = step
            
            for word in words:
                if word not in visited:
                    diff_cnt = sum(c1 != c2 for c1, c2 in zip(word, current_word))
                    if diff_cnt == 1:
                        visited.add(word)
                        queue.append((word, step + 1))
        
    return answer