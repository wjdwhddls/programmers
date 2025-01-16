def solution(a,b) : 
    sum = a+b
    if a<b :
        for i in range(a,b+1) :
            if a<i<b :
                sum = sum + i 
    elif b<a : 
        for i in range(b,a+1) :
            if b<i<a :
                sum = sum + i    
    else : 
        sum = a
    return sum

print(solution(6,3))
