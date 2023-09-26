import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stck = new Stack();
        
        for(int m : moves){
            int x = 0;
            
            for(int i = 0; i < board.length; i++){
                if(board[i][m-1] != 0){
                    x = board[i][m-1];
                    board[i][m-1] = 0;
                    System.out.println(x);
                    break;
                }
            }
            
            if(x != 0){
                if(!stck.isEmpty() && stck.peek() == x){
                    stck.pop();
                    answer += 2;
                }
                else
                    stck.push(x);
            }
        }
        
        return answer;
    }
}