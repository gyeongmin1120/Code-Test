import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        Map<String, String> map = new HashMap<String, String>();
        
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        char i = 'a';
        for(String s : mos){
            map.put(s, String.valueOf(i));
            i++;
        }
        
        String[] array = letter.split(" ");
        for(String str : array){
            answer.append(map.get(str));
        }
        
        return answer.toString();
    }
}