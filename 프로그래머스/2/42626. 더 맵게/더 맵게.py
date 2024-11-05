from heapq import heapify, heappop, heappush

def solution(scoville, K):

    heapify(scoville)
    
    ans = 0
    while len(scoville) > 1 and scoville[0] < K:
        first = heappop(scoville)
        second = heappop(scoville)
        new = first + (second * 2)
        heappush(scoville, new)
        ans += 1
    return ans if scoville[0] >= K else -1