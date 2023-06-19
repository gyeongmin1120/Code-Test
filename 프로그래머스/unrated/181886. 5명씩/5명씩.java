class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int)Math.ceil((double)names.length/5)];
        int index = 0;
        
        for(int i = 0; i < names.length; i = i+5){
            answer[index++] = names[i];
        }
        
        return answer;
    }
}