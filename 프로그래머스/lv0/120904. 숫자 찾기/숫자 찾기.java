class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        char[] chars = Integer.toString(num).toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            if(Character.forDigit(k, 10) == chars[i]){
                answer = i + 1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}