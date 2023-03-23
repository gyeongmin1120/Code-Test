class Solution {
    public int solution(String s) {
        int answer = 0;
        int prev = 0;
        
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++){
            if( i != 0 && !"Z".equals(str[i-1])){
                prev = Integer.parseInt(str[i-1]);
            }
            
            if("Z".equals(str[i])){
                answer -= prev;
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}