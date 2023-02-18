class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(char ch : rsp.toCharArray()){
            if(ch == '2') answer += '0';
            else if(ch == '0') answer += '5';
            else if(ch == '5') answer += '2';
        }
        return answer;
    }
}