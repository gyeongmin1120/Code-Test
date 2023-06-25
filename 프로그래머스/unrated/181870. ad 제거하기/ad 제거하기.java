class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad"))
                sb.append(strArr[i] + " ");
        }
        
        return sb.toString().split(" ");
    }
}