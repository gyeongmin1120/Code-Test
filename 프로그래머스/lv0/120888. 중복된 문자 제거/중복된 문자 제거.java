class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
             if(!answer.toString().contains(Character.toString(c))){
                 answer.append(c);
             }
        }
        
        return answer.toString();
    }
}