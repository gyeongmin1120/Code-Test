import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = Arrays.stream(num_list).sum();
        int mul = Arrays.stream(num_list).reduce(1, (a,b) -> a*b);
        
        answer = mul < sum * sum ? 1 : 0;
        
        return answer;
    }
}
