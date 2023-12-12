import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] arr_num = Arrays.stream(emergency).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr_num, Collections.reverseOrder());
        
        int[] result = new int[emergency.length];

        for (int i = 0; i< emergency.length; i++){
            for (int j = 0; j < emergency.length; j++){
                if (emergency[i] == arr_num[j]){
                    result[i] = j + 1;
                }
            }
        }
        
        return result; 
    }
}