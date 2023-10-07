class Solution {
    public String solution(String new_id) {
        //1단계
        String answer = new_id.toLowerCase(); 
        //2단계
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); 
        //3단계
        answer = answer.replaceAll("[.]{2,}", "."); 
        //4단계
        answer = answer.replaceAll("^[.]|[.]$", ""); 
        
        //5단계
        if (answer.equals(""))
            answer += "a";
        
        //6단계
        if (answer.length() >= 16) {     
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }

        //7단계
        if (answer.length() <= 2) 
            while (answer.length() < 3)
                answer += answer.charAt(answer.length()-1);
            

        return answer;
    }
}