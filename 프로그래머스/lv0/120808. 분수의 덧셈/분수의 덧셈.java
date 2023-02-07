class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        boolean check = 
            (0 < numer1 && numer1 < 1000 
             && 0 < numer2 && numer2 < 1000 
             && 0 < denom1 && denom1 < 1000 
             && 0 < denom2 && denom2 < 1000);
        
        if(check) {
            int numer = (numer1 * denom2) + (numer2 * denom1);
            int denom = denom1 * denom2;
            
            int max = numer < denom ? denom : numer;
            
            for(int i = max - 1; i > 1; i--){
                if(numer % i == 0 && denom % i == 0){
                    numer /= i;
                    denom /= i;
                }
            }
            
            answer[0] = numer;
            answer[1] = denom;
            
        }
        
        return answer;
    }
    
}