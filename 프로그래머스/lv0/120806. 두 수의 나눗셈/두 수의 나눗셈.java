class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        boolean check = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        
        if(check) answer = (int)((double)num1 / (double)num2 * 1000);
        else answer = -1;
        
        return answer;
    }
}