class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int[] query : queries){
            answer = answer.substring(0, query[0]) 
                + new StringBuilder(answer.substring(query[0], query[1] + 1)).reverse().toString() 
                + answer.substring(query[1] + 1, answer.length());
        }
        
        return answer;
    }
}