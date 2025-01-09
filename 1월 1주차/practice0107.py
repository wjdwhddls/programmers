def solution(n):
    arr = list(str(n))
    arr_int = list(map(int,arr))
    answer = sum(arr_int)
    return answer