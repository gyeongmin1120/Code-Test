class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int cnt = count(i);
            
            if(cnt > limit) answer += power;
            else answer += cnt;
        }
        
        return answer;
    }
    
    
    public int count(int num){
        int count = 1;
        
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0) count++;
        }
        
        return count;
    }
}
