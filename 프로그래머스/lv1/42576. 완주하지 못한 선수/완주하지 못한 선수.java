import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String part : participant)
            map.put(part, map.getOrDefault(part, 0) + 1);
        
        for(String com : completion){
            map.put(com, map.get(com) - 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
            }
        }
        
        
        return answer;
    }
}