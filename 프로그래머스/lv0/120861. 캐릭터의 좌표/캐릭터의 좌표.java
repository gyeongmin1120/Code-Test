class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        int x = (board[0] - 1) / 2;
        int y = (board[1] - 1) / 2;
        
        for(String key : keyinput){
            if(key.equals("up")){
                if(answer[1] + 1 <= y)
                    answer[1] += 1;
            }else if(key.equals("down")){
                if(answer[1] - 1 >= (-1) * y)
                    answer[1] -= 1;
            }else if(key.equals("left")){
                if(answer[0] - 1 >= (-1) * x)
                    answer[0] -= 1;
            }else if(key.equals("right")){
                if(answer[0] + 1 <=  x)
                    answer[0] += 1;
            }
        }
        
        return answer;
    }
}