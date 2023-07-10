class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = 0; i < my_string.length(); i = i+m){
            answer.append(String.valueOf(my_string.substring(i, i + m).charAt(c-1)));
        }
        
        return answer.toString();
    }
}