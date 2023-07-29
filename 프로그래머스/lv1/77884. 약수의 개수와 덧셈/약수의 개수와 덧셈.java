class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int count = calc(i);
            
            if(count % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    
    public int calc(int n){
        //n 포함하므로 1부터 시작
        int cnt = 1;
        
        for(int i = 1; i <= n/2; i++)
            if(n % i == 0) cnt++;
        
        return cnt;
    }  
    
}