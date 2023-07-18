import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = arr.length - 1;
        int end = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start = Math.min(start, i);
                end = Math.max(end, i);
            } 
        }
        
        if(end == -1) answer = new int[]{-1};
        else answer = Arrays.copyOfRange(arr, start, end + 1);
            
        return answer;
    }
}
