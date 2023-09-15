import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                
                if(lost[i] != 0 && reserve[j] != 0){
                    int abs = Math.abs(lost[i] - reserve[j]);
                    
                    if(abs == 1 || abs == 0){
                        
                        if(j < reserve.length - 1 
                           && (lost[i] != reserve[j + 1]) ){
                            
                            if(i < lost.length - 1 
                               && lost[i + 1] != reserve[j]){
                                lost[i] = 0;
                                reserve[j] = 0;
                                continue;
                                
                            }else if(i == lost.length - 1 ){
                                lost[i] = 0;
                                reserve[j] = 0;
                                continue;
                            }
                            
                        } else if(j == reserve.length - 1 ){
                            lost[i] = 0;
                            reserve[j] = 0;
                            continue;
                        }
                    }
                }
            }
        }
        
        for(int lo : lost){
            if(lo > 0){
                cnt++;
            }
        }
        
        return n - cnt;
    }
}