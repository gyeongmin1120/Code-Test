class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArr = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        
        for(String str : strArr){
            if(!"".equals(str)){
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}