import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int result = 0;
        
        IntStream numStream = IntStream.of(num_list);
        result = (int)numStream.filter(num -> num % 2 == 0).count();
        
        return new int[]{result, num_list.length - result};
    }
}