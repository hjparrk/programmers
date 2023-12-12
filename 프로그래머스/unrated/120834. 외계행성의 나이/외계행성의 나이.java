import java.util.HashMap;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] array = "a b c d e f g h i j".split(" ");
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) map.put(i, array[i]);
        for(char c : String.valueOf(age).toCharArray()) {
            answer += map.get(Character.getNumericValue(c));
        }
        return answer;
    }
}