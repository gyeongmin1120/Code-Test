import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int middle = array.length / 2;
        
        Arrays.sort(array);
        answer = array[middle];
        
        return answer;
    }
}