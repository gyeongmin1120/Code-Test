import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(numbers[0] * numbers[1] > answer){
            answer = numbers[0] * numbers[1];
        }
        
        return answer;
    }
}