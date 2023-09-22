class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
            
        for(char c : s.toCharArray()){
            int i = 1;
            int cnt = 0;
            while(cnt < index){
                
                String str = "" + (char)(((i + c - 97) % 26) + 97);
                
                if(!skip.contains(str)){
                    cnt++;
                    
                    if(cnt == index){
                        answer.append(str);
                        continue;
                    }
                }
                
                i++;
            }
            
        }
        
        
        return answer.toString();
    }
}