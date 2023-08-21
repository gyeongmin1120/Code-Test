import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList();
        
        list.add(0, score[0]);
        answer[0] = list.get(0);
        
        for(int i = 1; i < score.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(score[i] > list.get(j)){
                    if(j == 0)
                        list.add(0, score[i]);
                    else
                        list.add(j, score[i]);
                    
                    break;
                }else if(j == list.size() - 1){
                    list.add(j + 1, score[i]);
                    break;
                }
                    
            }
                
            if(list.size() < k)
                answer[i] = list.get(list.size() - 1);
            else
                answer[i] = list.get(k-1);  
            
            //System.out.println(list);
        }
        
        return answer;
    }
}