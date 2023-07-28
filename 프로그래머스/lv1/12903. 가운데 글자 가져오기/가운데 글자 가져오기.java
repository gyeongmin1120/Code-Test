class Solution {
    public String solution(String s) {
        int start = s.length() / 2;
        
        return s.length() % 2 == 0 ?  s.substring(start - 1, start + 1) : s.substring(start, start + 1);
    }
}