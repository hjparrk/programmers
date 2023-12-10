import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int number : array){
            int count = map.getOrDefault(number, 1) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}