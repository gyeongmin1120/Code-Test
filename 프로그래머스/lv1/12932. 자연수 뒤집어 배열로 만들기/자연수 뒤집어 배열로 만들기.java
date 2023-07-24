import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String[] str = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        
        return Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    }
}