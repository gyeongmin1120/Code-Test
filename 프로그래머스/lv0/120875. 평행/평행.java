import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        for(int i = 0; i < dots.length - 1; i++){
            
            double x1 = 
                (double)(dots[(i + 1) % 4][1] - dots[i][1]) / (dots[(i + 1) % 4][0] - dots[i][0]);
            double x2 = 
                (double)(dots[(i + 3) % 4][1] - dots[(i + 2) % 4][1]) / (dots[(i + 3) % 4][0] - dots[(i + 2) % 4][0]);
            
            if(x1 == x2) return 1;
            
        }
        
        return 0;
    }
}