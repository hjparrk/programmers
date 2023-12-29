def solution(balls, share):
    memo = [i for i in range(balls+1)]
    memo[0] = 1
    for i in range(2, len(memo)):
        memo[i] *= memo[i-1]        
    return memo[balls] / (memo[balls - share] * memo[share])