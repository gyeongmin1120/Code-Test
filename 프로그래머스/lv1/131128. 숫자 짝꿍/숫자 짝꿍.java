import java.util.*;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(char c : X.toCharArray()){
            xArr[c - '0']++;
        }
        
        for(char c : Y.toCharArray()){
            yArr[c - '0']++;
        }
        
        
        for(int i = 9; i >= 0; i--){
            if(xArr[i] > 0 && yArr[i] > 0){
                String str = String.valueOf(xArr[i]);
                
                sb.append(String.valueOf(i).repeat(Math.min(xArr[i], yArr[i])));
            }
        }
        
        
        if("".equals(sb.toString()))
            return "-1";
        
        if(sb.toString().replaceAll("0", "").equals(""))
            return "0";
        
        
        return sb.toString();
    }
}