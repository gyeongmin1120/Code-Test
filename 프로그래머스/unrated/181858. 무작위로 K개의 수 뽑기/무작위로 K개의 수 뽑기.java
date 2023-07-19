import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int index = 0;
        List<Integer> list = new ArrayList();
        
        Arrays.fill(answer, -1);
        
        while(list.size() < k){
            if(!list.contains(arr[index])) list.add(arr[index]);
    
            index++;
            
            if(index == arr.length) break;
        }
       
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
    
        
        return answer;
    }
}