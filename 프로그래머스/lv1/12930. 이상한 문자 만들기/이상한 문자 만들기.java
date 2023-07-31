class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] arr = s.split(" ", -1);
        
        for(int index = 0 ; index < arr.length; index++){
            String str = arr[index];
            
            for(int i = 0 ; i < str.length(); i++){
                if(i % 2 == 0)
                    if(str.charAt(i) >= 97 && str.charAt(i) <= 122) 
                        answer.append(String.valueOf((char)(str.charAt(i) - 32)));
                    else
                        answer.append(str.charAt(i));
                else
                    if(str.charAt(i) >= 65 && str.charAt(i) <= 90) 
                        answer.append(String.valueOf((char)(str.charAt(i) + 32)));
                    else
                        answer.append(str.charAt(i));
            }
            
            if(index != arr.length - 1)
                answer.append(" ");
           
        }
        return answer.toString();
    }
}