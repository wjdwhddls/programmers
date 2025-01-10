def solution(x, n):
    arr = []  
    for i in range(n):
        arr.append((i + 1) * x)  
    return arr

print(solution(2, 5))
print(solution(-4, 3))
