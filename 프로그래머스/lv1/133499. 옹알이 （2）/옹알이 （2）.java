class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] target = {"aya", "ye", "woo", "ma"};
        
        for(String bab : babbling){
            for(int i = 0; i < target.length; i++){
                    bab = bab.replace(target[i], String.valueOf(i));
            }
            
        
            if(bab.matches("^[0-9]*$")){
                boolean relay = true;
                
                for(int i = 0; i < bab.length() - 1; i++){
                    if(bab.charAt(i) == bab.charAt(i + 1))
                        relay = false;
                }
                
                if(relay) answer++;
            }
        }   
        return answer;
    }
}
