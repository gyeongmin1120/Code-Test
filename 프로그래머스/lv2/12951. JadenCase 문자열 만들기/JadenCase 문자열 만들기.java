import java.util.*;

class Solution {
    public String solution(String s) {
        //StringBuilder answer = new StringBuilder();
        String[] sArr = s.split(" ", -1);
        String[] result = new String[sArr.length];
        
        for(int i = 0; i < sArr.length; i++){
            if(!sArr[i].equals("")){
                //answer.append(
                //sArr[i].substring(0, 1).toUpperCase() + sArr[i].substring(1, sArr[i].length()).toLowerCase());
               
                result[i] = sArr[i].substring(0, 1).toUpperCase() + sArr[i].substring(1, sArr[i].length()).toLowerCase();
                
                //if(i != sArr.length - 1) answer.append(" ");
            }
            else
                result[i] = sArr[i];
        }
        
        return String.join(" ", result);
    }
}