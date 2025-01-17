def solution(seoul):  
    for i in range(len(seoul)): 
        if seoul[i] == 'Kim':  
            loc = i   
    
    answer = '김서방은 ' + str(loc) + '에 있다.' 
    return answer  

print(solution(["Jane", "Kim"]))