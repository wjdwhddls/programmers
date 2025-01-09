def solution(n):
    if not (3<= n <= 1000000):
        return None
    for x in range(1,n+1):
        if n%x == 1:
            return x
