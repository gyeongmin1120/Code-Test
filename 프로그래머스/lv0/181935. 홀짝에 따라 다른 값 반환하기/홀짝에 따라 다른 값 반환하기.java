class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0){
            for(int i=2; i<=n; i=i+2){
                 answer += Math.pow(i, 2);
            }
        }else{
            answer += Math.pow(n + 1, 2) / 4;
        }
        
        return answer;
    }
}
