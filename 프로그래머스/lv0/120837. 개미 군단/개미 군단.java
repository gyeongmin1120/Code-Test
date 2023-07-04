class Solution {
    public int solution(int hp) {
        int answer = hp / 5;
        int remain = hp % 5;
        
        if(remain > 0){
            answer += remain / 3;
            remain = remain % 3;
        }

        answer += remain;
            
      
                
        return answer;
    }
}