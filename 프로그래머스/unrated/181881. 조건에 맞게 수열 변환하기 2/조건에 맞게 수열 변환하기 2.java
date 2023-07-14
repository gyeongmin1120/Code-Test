import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prev = cal(arr);

        while(answer >= 0){
            int[] cur = cal(prev);

            if(Arrays.equals(prev, cur)){
                break;
            }else{
                prev = cur.clone();
                answer++;
            }
        }

        return answer;
    }
    
    public int[] cal(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i]  % 2 == 0) result[i]  = arr[i] / 2;
            else if(arr[i]  < 50 && arr[i]  % 2 == 1) result[i]  = 2 * arr[i]  + 1;
        }

        return result;
    }
}