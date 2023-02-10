import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if( n <= 7){
            answer = 1;
        } else {
            answer =  (int)Math.ceil((double)n / 7);
        }
        
        return answer;
    }
}