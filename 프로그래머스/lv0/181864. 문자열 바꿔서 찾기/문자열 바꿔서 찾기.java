class Solution {
    public int solution(String myString, String pat) {
      
        StringBuffer sb = new StringBuffer();
        
        for(char c : myString.toCharArray()){
            if("A".equals(String.valueOf(c))) sb.append("B");
            else if("B".equals(String.valueOf(c))) sb.append("A");
            else sb.append(c);
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}
