import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int length = num_list.length;
        int last = length - 1;
        
        if(num_list[last] > num_list[last-1])
            answer[length] = num_list[last] - num_list[last-1];
        else 
            answer[length] = num_list[last] * 2;
            
            
        return answer;
    }
}