class Solution {
    public String solution(String myString, String pat) {
        int index = -1;
        
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            if(myString.substring(i, i + pat.length()).equals(pat)){
                index = Math.max(index, i);
            }
        }
        
        return myString.substring(0, index + pat.length());
    }
}