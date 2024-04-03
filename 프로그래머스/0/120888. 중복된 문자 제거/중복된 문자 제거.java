import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        HashSet<Character> chars = new HashSet<>();
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if (!chars.contains(c)) {
                chars.add(c);
                answer += c;
            }
        }
        
        return answer;
    }
}