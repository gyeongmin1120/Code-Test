class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0;
        long itv = x;
        
        while(index < n){
            answer[index++] = itv;
            itv += x;
        }
        
        return answer;
    }
}
