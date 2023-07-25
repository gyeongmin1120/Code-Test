class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int result = 0;
            
            if(arr[1].equals("+"))
                result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            else
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            
            if(result == Integer.parseInt(arr[4]))
                answer[i] = "O";
            else
                answer[i] = "X";
        }
        
        
        return answer;
    }
}