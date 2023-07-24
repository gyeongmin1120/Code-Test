class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] strArr = polynomial.split(" ");
        
        int x = 0;
        int n = 0;
        
        for(String str : strArr){
            
           if(!str.equals("+") && str.contains("x")){
                String xFront = str.length() != 1 ? str.substring(0, str.length()-1) : "1";
                x += Integer.parseInt(xFront);
           }
            else if(!str.equals("+") && !str.contains("x")) n += Integer.parseInt(str);
        }
        
        if(x > 1){
            answer += x + "x";
        }else if(x == 1){
            answer += "x";
        }
        
        if(x != 0 && n != 0) answer += " + ";
        
        if(n != 0) answer += n;
        
        return answer;
    }
}