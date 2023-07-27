import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList();
        
        for(int n : arr){
            if(n % divisor == 0)
                list.add(n);
        }
        
        Collections.sort(list);
    
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}