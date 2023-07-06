import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        if("right".equals(direction)){
            return IntStream.concat(
                IntStream.of(numbers[numbers.length-1]),
                IntStream.of(Arrays.copyOfRange(numbers, 0, numbers.length - 1))
            ).toArray();
        }else{
            return IntStream.concat(
                IntStream.of(Arrays.copyOfRange(numbers, 1, numbers.length)),
                IntStream.of(numbers[0])
            ).toArray();
        }
    }
}