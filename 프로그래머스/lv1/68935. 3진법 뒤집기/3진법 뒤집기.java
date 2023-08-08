class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n != 0){
            sb.append(String.valueOf(n % 3));
            n /= 3;
        }
        
        String str = sb.toString();
        for(int i = 0; i < str.length(); i++){
            answer += 
                Integer.parseInt(String.valueOf(str.charAt(str.length() - 1 - i))) * Math.pow(3, i);
        }
        
        return answer;
    }
}