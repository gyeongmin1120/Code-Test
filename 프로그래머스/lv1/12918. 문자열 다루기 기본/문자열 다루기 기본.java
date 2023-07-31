class Solution {
    public boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6 ? true : false;
        
        if(answer)
            for(char c : s.toCharArray())
                if(c < 48 || c > 57) return false;
       
        return answer;
    }
}