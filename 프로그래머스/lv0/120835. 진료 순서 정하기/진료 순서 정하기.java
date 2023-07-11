import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] copy = emergency.clone();
        Arrays.sort(copy);
        
        for(int i = 0; i < copy.length; i++)
            for(int j = 0; j < emergency.length; j++)
                if(copy[i] == emergency[j]) answer[j] = copy.length - i;
        
        return answer;
    }
}