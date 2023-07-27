import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i])
                list.add(rank[i]);
        }
        
        Collections.sort(list);
        
        
        int a = findIndex(rank, list.get(0));
        int b = findIndex(rank, list.get(1));
        int c = findIndex(rank, list.get(2));
        
        return 10000 * a + 100 * b + c;
    }
    
    public int findIndex(int[] arr, int target){
        int index = -1;
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == target) index = i;
        
        return index;
    }
}