class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char c : my_string.toCharArray()) answer = c + answer;
        return answer;
        
//         import java.util.StringBuilder;
//         StringBuilder sb = new StringBuilder();
//         sb.append(my_string);
//         sb.reverse();

//         return sb.toString();
    }
}