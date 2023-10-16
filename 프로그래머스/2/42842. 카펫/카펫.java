class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 2; i <= sum / 2; i++){
            if(sum % i == 0 && sum / i <= i){
                int j = (int)sum / i;
                
                if((i - 2) * (j - 2) == yellow){
                    answer[0] = i;
                    answer[1] = j;
                    
                    break;
                }
            }
        }
        return answer;
    }
}