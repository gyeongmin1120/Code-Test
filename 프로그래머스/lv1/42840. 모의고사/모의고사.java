import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        int[] no1 = {1, 2, 3, 4, 5};
        int[] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == no1[i % 5]) score[0]++;
            if(answers[i] == no2[i % 8]) score[1]++;
            if(answers[i] == no3[i % 10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < 3; i++)
            if(max == score[i])
                list.add(i + 1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}