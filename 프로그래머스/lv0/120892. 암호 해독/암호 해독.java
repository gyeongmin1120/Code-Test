class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        char[] charArr = cipher.toCharArray();
        
        for(int i = code; i<=charArr.length; i++){
            if(i % code == 0) answer.append(charArr[i-1]);
        }
        return answer.toString();
    }
}