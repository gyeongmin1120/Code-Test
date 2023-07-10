class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = numLog.length-1; i > 0; i--){
            if(numLog[i] - numLog[i-1] == 1) answer.append("w");
            else if(numLog[i] - numLog[i-1] == -1) answer.append("s");
            else if(numLog[i] - numLog[i-1] == 10) answer.append("d");
            else if(numLog[i] - numLog[i-1] == -10) answer.append("a");
        }
        
        return answer.reverse().toString();
    }
}