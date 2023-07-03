class Solution {
    public int[] solution(String myString) {
        boolean last = false;
        String[] strArr = myString.split("x");
        String lastStr = String.valueOf(myString.charAt(myString.length()-1));
        
        if(lastStr.equals("x")) last = true;        
        int[] answer = last ? new int[strArr.length + 1] : new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            answer[i] = strArr[i].length();
        }
        
        if(last) answer[strArr.length] = 0;
        
        return answer;
    }
}