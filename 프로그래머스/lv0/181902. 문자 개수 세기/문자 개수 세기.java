class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char c : my_string.toCharArray()){
           int n = c >= 97 ? c - 71 : c - 65;
            
           answer[n]++;
        }
        
        return answer;
    }
}
