import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int[] query : queries){
            int min = Arrays.stream(arr).max().getAsInt() + 1;
            
            for(int i = query[0]; i <= query[1]; i++){
                if(arr[i] > query[2]){
                    min = Math.min(arr[i], min);
                }
            }
            
            if(min == Arrays.stream(arr).max().getAsInt() + 1) 
                list.add(-1);
            else 
                list.add(min);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}