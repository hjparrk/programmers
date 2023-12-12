import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> filtered = new ArrayList<Integer>();
        for(int num : numlist) if(num % n == 0) filtered.add(num);
        int[] answer = new int[filtered.size()];
        for(int i = 0; i < filtered.size(); i++) answer[i] = filtered.get(i);
        return answer;
    }
}