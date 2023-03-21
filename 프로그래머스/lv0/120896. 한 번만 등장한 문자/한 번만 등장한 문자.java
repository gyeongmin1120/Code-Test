import java.util.*;

class Solution {
    public String solution(String s) {
       
        char[] cArr = s.toCharArray();
        
        for(char c : cArr){
            if((s.length() - s.replaceAll(String.valueOf(c),"").length()) > 1){
                s = s.replaceAll(String.valueOf(c),"");
            }
        }
        
        cArr = s.toCharArray();
        Arrays.sort(cArr);
        
        return new String(cArr);
    }
}