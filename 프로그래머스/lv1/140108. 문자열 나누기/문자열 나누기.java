class Solution {
    public int solution(String s) {
        int answer = 0;
        int eq = 0;
        char x = ' ';
        int diff = 0;
        
        for(int i = 0;  i < s.length(); i++){
            char c = s.charAt(i);
            
            if(x == ' ')
                x = c;
            
            if(x == c)
                eq++;
            
            if(x != c)
                diff++;
            
            if(eq == diff){
                answer++;
                x = ' ';
                eq = 0;
                diff = 0;
            }else if( i == s.length() - 1){
                answer++;
            }
                
        }
        
        
        
        return answer;
    }
}
