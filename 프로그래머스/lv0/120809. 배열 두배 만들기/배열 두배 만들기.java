import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        return Arrays.stream(numbers).map(num -> num * 2).toArray();
    }
}