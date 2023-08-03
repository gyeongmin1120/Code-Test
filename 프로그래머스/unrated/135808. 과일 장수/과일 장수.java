import java.util.*;


class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int index = score.length - m;
        
        while(index >= 0){
            answer += score[index] * m * 1;
            
            index -= m;
        }
        
        return answer;
    }
}