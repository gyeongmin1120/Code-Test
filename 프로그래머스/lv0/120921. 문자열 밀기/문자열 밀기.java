class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int length = A.length();
        
        for(int i = 0; i < length; i++){
            String str = i == 0 ? 
                A.substring(0 , length - i) : A.substring(length - i, length) + A.substring(0, length - i);
            
            if(str.equals(B)) 
                return i;
        }
        
        return answer;
    }
}