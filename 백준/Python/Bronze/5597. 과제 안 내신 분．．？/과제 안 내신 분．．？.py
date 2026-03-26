student = [num+1 for num in range(30)]

for i in range(28):
    n = int(input())
    student.remove(n)
    
print(min(student))
print(max(student))