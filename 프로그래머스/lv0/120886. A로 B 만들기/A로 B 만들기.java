import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] charArr = before.toCharArray();
        char[] charArr2 = after.toCharArray();
        
        Arrays.sort(charArr);
        Arrays.sort(charArr2);
        
        before = new String(charArr);
        after = new String(charArr2);
        
        if(before.contains(after)) answer = 1;
        
        return answer;
    }
}