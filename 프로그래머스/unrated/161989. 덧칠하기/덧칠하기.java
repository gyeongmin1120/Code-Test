import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n];
        
        for(int sec : section)
            arr[sec-1] = 1;
        
        int i = section[0] - 1;
        
        while(i <= n - 1){
            if(arr[i] == 1){
                int max = i + m >= n ? n - i : i + m;
                
                for(int j = i; j < max; j++)
                    arr[j] = 0;
                
                i += m;
                
                answer++;
            }else{
                i++;
            }
        }
        
        return answer;
    }
}