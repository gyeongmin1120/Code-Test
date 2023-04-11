class Solution {
    public int solution(String my_string) {
        
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        int i = 1;
        
        while(i < strArr.length){
            if("+".equals(strArr[i])){
                answer += Integer.parseInt(strArr[i+1]);
            }else if("-".equals(strArr[i])){
                answer -= Integer.parseInt(strArr[i+1]);
            }
            
            i += 2;
        }
      
        return answer;
    }
}