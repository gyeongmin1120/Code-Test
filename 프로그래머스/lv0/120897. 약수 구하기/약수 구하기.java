import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<String> list = new ArrayList<String>();
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                list.add(Integer.toString(i));
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i < list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        
        return answer;
    }
}