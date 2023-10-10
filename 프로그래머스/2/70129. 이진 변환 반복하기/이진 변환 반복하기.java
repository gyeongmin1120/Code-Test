class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = 0;
        int zero = 0;
        
        while(s.length() > 1){
            int length = s.length();
            
            s = s.replace("0", "");
            
            zero += length - s.length();
            answer[0]++;
            
            s = Integer.toBinaryString(s.length());
        }
        
        answer[1] = zero;
        
        return answer;
    }
}