class Solution {
    public int solution(String number) {
        int answer = 0;
        int result = 0;
        
        try{
            
            answer = Integer.parseInt(number) % 9;
            
        }catch(Exception e){
            
            for(char c : number.toCharArray()){
                result += Integer.parseInt(String.valueOf(c));
            }
            
            answer = result % 9;
        }
        
        return answer;
    }
}
