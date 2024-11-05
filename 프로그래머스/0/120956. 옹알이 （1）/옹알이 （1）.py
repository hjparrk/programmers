def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]
    for s in babbling:
        length = len(s)
        for word in words:
            if word in s:
                s = s.replace(word, "*" * len(word))
        if s == "*" * length:
            answer += 1
    return answer