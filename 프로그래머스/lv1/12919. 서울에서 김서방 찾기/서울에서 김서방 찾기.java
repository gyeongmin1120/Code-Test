class Solution {
    public String solution(String[] seoul) {
        int index = -1;
        
        for(int i = 0; i < seoul.length; i++){
            if("Kim".equals(seoul[i])) index = i;
        }
        
        return "김서방은 " + index + "에 있다";
    }
}