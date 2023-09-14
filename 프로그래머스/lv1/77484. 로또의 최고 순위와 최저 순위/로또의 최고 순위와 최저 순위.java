class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int eq = 0;
        int zero = 0;
        
        for(int lotto : lottos){
            if(lotto == 0)
                zero++;
            else{
                for(int win : win_nums)
                    if(lotto == win)
                        eq++;
            }
        }
        
        int[] scoreArr = {6, 5, 4, 3, 2, 1};
        
        //최고 등수
        int score = zero + eq;
        if(score >= 6)
            score = 6;
        else if(score < 2)
            score = 1;
        
        answer[0] = scoreArr[score - 1];
        
        
        //최저등수
        if(eq >= 6)
            eq = 6;
        else if(eq < 2)
            eq = 1;
        
        answer[1] = scoreArr[eq - 1];
        
        return answer;
    }
}