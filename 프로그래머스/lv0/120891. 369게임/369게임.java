class Solution {
    public int solution(int order) {
        int answer = 0;
        
        char[] ch = String.valueOf(order).toCharArray();
        for(char c : ch){
            if(c == '3' || c == '6' || c == '9'){
                answer += 1;
            }
        }
        return answer;
    }
}