class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        for(int i = 1; i <= b; i++){
            if(b % i == 0 && a % i != 0)
                if(i % 2 != 0 && i % 5 != 0)
                    answer = 2;
        }
        
        return answer;
    }
}