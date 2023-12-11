import java.util.HashMap;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashMap<String, Boolean> map = new HashMap<>();
        int counter = 0;
        for(String s : s1) map.put(s, false);
        for(String s : s2) if(map.containsKey(s)) map.put(s, true);
        for(String key : map.keySet()) if(map.get(key)) counter++;
        return counter;
    }
}