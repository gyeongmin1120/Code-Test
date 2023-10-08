import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++){
            String key = "";
            int val = 0;
            
            if(choices[i] < 4) {
                key = String.valueOf(survey[i].charAt(0));
                val = 4 - choices[i];
            }
                
            else if(choices[i] > 4) {
                key = String.valueOf(survey[i].charAt(1));
                val = choices[i] % 4;
            }
            
            map.put(key, map.getOrDefault(key, 0) + val);
        }
        
        answer.append(map.get("R") < map.get("T") ? "T" : "R");
        answer.append(map.get("C") < map.get("F") ? "F" : "C");
        answer.append(map.get("J") < map.get("M") ? "M" : "J");
        answer.append(map.get("A") < map.get("N") ? "N" : "A");
        
        
        return answer.toString();
    }
}