class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder target = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        target.append(my_string.substring(s, e+1));
        target = target.reverse();
        
        answer.append(my_string.substring(0, s));
        answer.append(target);
        answer.append(my_string.substring(e + 1));
        
        return answer.toString();
    }
}