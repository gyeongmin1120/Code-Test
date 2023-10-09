import java.util.*;

class Solution{
    public int solution(String s){
        Stack<String> stack = new Stack();
        
        for(char c : s.toCharArray()){
            String str = String.valueOf(c);
            
            if(stack.size() != 0){
                if(stack.peek().equals(str))
                    stack.pop();
                else
                    stack.push(str);
            }else{
                stack.push(str);
            }
        }
        
        
        return stack.size() == 0 ? 1 : 0;
    }
}