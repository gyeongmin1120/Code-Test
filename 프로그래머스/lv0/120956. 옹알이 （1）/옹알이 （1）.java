class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String bab : babbling){
            String str = bab.replaceAll("aya", "/");
            str = str.replaceAll("ye", "/");
            str = str.replaceAll("woo", "/");
            str = str.replaceAll("ma", "/");
            
            if(str.replaceAll("/", "").length() == 0) answer++;
        }
        
        
        return answer;
    }
}