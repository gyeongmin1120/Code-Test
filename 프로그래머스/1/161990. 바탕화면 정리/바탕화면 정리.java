import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {wallpaper.length, wallpaper[0].length(), 0, 0};
        
        for(int i = 0; i < wallpaper.length; i++){
            String str = wallpaper[i];
            
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '#'){
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                    
                    
                }
            }
        }
        
        if(answer[2] > wallpaper.length)
            answer[2] = wallpaper.length;
        if(answer[3] > wallpaper[0].length())
            answer[3] = wallpaper.length;
        
        return answer;
    }
}