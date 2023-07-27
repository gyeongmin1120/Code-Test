import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap();
        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);
        
        if(map.size() == 1){
            answer = 1111 * a;
        } else if(map.size() == 4){
            answer = Math.min(a, Math.min(b, Math.min(c, d)));
        } else if(map.size() == 3){
            answer = (int)getKey(map, 1).get(0) * (int)getKey(map, 1).get(1);
        } else if(map.size() == 2){
            if(getKey(map, 1).size() > 0){
                int p = (int)getKey(map, 3).get(0);
                int q = (int)getKey(map, 1).get(0);
                
                answer = (10 * p + q) * (10 * p + q);
            }else{
                int p = (int)getKey(map, 2).get(0);
                int q = (int)getKey(map, 2).get(1);
                
                answer = (p + q) * Math.abs(p - q);
            }
        }
        
        return answer;
    }
    
    public List getKey(HashMap<Integer, Integer> hmap, Integer value){
        List<Integer> keyList = new ArrayList<Integer>();
        
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            if(entry.getValue().equals(value) ){
              keyList.add(entry.getKey());
            }
        }
        
        return keyList;
    }
}