class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger = "1231";
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < ingredient.length; i++){
            sb.append(ingredient[i]);
            
            if(sb.length() > 3 
               && sb.subSequence(sb.length() - 4, sb.length()).equals(burger)){
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }
            
        return answer;
    }
}