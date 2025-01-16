def solution(num) : 
    count =0
    while True :
        if num != 1:
            if num%2==0 :
                num = int(num/2)
            else :
                num = num*3 + 1
            count += 1
            
        else :
            break
    if count > 500:
        count = -1
    return count

print(solution(626331))
    