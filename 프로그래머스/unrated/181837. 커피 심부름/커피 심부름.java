class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String ord : order){
            if(ord.contains("cafelatte")) answer += 5000;
            else answer += 4500;
        }
        
        return answer;
    }
}