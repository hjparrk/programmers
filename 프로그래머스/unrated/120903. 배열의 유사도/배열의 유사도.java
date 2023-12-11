// import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int solution(String[] s1, String[] s2) {
        // HashMap<String, Boolean> map = new HashMap<>();
        // int counter = 0;
        // for(String s : s1) map.put(s, false);
        // for(String s : s2) if(map.containsKey(s)) map.put(s, true);
        // for(String key : map.keySet()) if(map.get(key)) counter++;
        // return counter;
        
        HashSet<String> set = new HashSet<>(List.of(s1));
        int counter = 0;
        for (String s : s2) if(set.contains(s)) counter++;
        return counter;
    }
}