import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap();
        
        for(int i = 0; i < name.length; i++)
            map.put(name[i], yearning[i]);
        
        for(int i = 0; i < photo.length; i++){
            int result = 0;
            
            for(String str : photo[i]){
                result += map.getOrDefault(str, 0);
            }
            
            answer[i] = result;
        }
        
        
        return answer;
    }
}
