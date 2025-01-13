def solution(n) : 
    if (n % n**(1/2)) == 0 :
        answer = (n**(1/2) + 1) * (n**(1/2) + 1)
    else :
        answer = -1
    return answer

print(solution(121))