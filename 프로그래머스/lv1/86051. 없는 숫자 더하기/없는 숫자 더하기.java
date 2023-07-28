import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        
        for(int i = 1;  i < 10; i++)
            if(!list.contains(i))
                answer += i;
        
        return answer;
    }
}