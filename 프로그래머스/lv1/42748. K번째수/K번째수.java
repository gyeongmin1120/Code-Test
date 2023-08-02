import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int[] com : commands){
            int[] arr = Arrays.copyOfRange(array, com[0] - 1, com[1]);
            
            Arrays.sort(arr);
            answer[index++] = arr[com[2] - 1];
        }
        
        return answer;
    }
}