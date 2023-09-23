class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        String org = Integer.toBinaryString(n);
        for(char c : org.toCharArray())
            if(c == '1')
                cnt++;
        
        for(int i = n + 1; i <= 1000000; i++){
            int count = 0;
            String target = Integer.toBinaryString(i);
            for(char c : target.toCharArray()){
                if(c == '1')
                    count++;
            }
            
            if(cnt == count){
                answer = i;
                break;
            }
                
        }
        
        return answer;
    }
}