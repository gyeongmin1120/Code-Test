class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            int j = i + 1;
            int sum = i;
            
            while(sum < n){
                sum += j;
                j++;
            }
            
            if(sum == n)
                answer++;
        }
        
        return answer;
    }
}