import java.util.*;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        long max = Long.parseLong(sArr[0]);
        long min = Long.parseLong(sArr[0]);
        
        for(int i = 1; i < sArr.length; i++){
            long target = Long.parseLong(sArr[i]);
            
            if(max < target) max = target;
            if(min > target) min = target;
        }
        
        return new StringBuilder().append(min).append(" ").append(max).toString();
    }
}