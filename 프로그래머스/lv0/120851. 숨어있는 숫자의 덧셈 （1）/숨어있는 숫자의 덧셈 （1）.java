import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]","");
        
        for(char c : my_string.toCharArray()){
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}