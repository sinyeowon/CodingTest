a, b = input().split()
b = int(b)

result = 0
for i in range(len(a)):
    if a[len(a)-(i+1)].isdigit():
        result += (pow(b, i))*int(a[len(a)-(i+1)])
    else:
        result += (pow(b, i))*(ord(a[len(a)-(i+1)])-55)
    
print(result)