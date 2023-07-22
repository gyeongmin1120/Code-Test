import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList();
        
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i).replaceAll("[5|0]", "");
            
            if(str.length() == 0) list.add(i);
        }
        
        if(list.size() == 0) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}