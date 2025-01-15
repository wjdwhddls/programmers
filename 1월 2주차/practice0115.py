def solution(x) : 
    x1 = list(str(x))
    x2 = list(map(int,x1))
    sum = 0
    for i in range(0,len(x2)) : 
        sum = sum + x2[i]
    if x%sum == 0 : 
        return True
    else :
        return False 

print(solution(11))
