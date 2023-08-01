import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        
        int answer = 0;
        
        for(int i = 0; i < d.length; i++){
            if(answer + d[i] > budget)
                 return i;
            else if(answer + d[i] == budget)
                return i + 1;
            else
                answer += d[i];
        }
        
        return d.length;
    }
}