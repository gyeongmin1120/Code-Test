class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //System.out.println((n+1));
        
        return Math.sqrt(n) == (int)Math.sqrt(n) ? (long)Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}