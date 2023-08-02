class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        sb.append("0");
        
        for(int i = food.length - 1; i >= 1; i--){
            int cnt = food[i] / 2;
            
            if(cnt >= 1){
                sb.append(String.valueOf(i).repeat(cnt));
                sb.insert(0, String.valueOf(i).repeat(cnt));
            }
            
        }
        
        return sb.toString();
    }
}