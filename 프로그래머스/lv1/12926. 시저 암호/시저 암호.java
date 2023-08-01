class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        
        for(char c : s.toCharArray()){
            if(c == ' ')
                sb.append(" "); 
            else if(c >= 97){
                if(c + n > 122) 
                    sb.append((char)((int)(c + n) % 123 + 97));
                else
                    sb.append((char)((int)c + n));
            } else if(c >= 65 && c <= 90) {
                if(c + n > 90) 
                   sb.append((char)((int)(c + n) % 91 + 65));
                else
                    sb.append((char)((int)c + n));
            }
        }
        
        return sb.toString();
    }
}