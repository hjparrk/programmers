import re

def solution(babbling):
    regex = re.compile('^(aya|ye|woo|ma)+$')
    ans = 0
    for e in babbling:
        if regex.match(e):
            ans += 1
    return ans