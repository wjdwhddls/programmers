def solution(n):
    sum = 0
    for i in range(i,n+1):
        if n%i == 0:
            sum = sum + i
    return sum