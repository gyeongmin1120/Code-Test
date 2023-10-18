import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //{이름 = 인덱스}
        HashMap<String, Integer> map  = new HashMap();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int index = map.get(callings[i]);
            String swap = players[index - 1];
            
            players[index - 1] = callings[i];
            players[index] = swap;
            
            map.put(swap, index);
            map.put(callings[i], index - 1);
        }
        
        return players;
    }
    
}