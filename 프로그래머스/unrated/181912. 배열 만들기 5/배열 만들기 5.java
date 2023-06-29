import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuffer result = new StringBuffer();
        
        for(String str : intStrs){
            if(Integer.parseInt(str.substring(s, s + l)) > k)
                 result.append(str.substring(s, s + l) + ",");
           
        }
        
        return Arrays.stream(result.toString().split(",")).mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}