# import math

# def solution(balls, share):
#     # memo = [i for i in range(balls+1)]
#     # memo[0] = 1
#     # for i in range(2, len(memo)):
#     #     memo[i] *= memo[i-1]        
#     # return memo[balls] / (memo[balls - share] * memo[share])
    
#     return math.comb(balls, share)

def solution(balls, share):
    answer = factorial(balls) / (factorial(balls - share) * factorial(share))
    return answer

def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result = result * i
    return result