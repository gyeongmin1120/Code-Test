class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        
        if(a != b && a != c && b != c){
            answer *= 1;
        }else if(a == b && a == c && b == c){
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }else{
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        
        return answer;
    }
}
