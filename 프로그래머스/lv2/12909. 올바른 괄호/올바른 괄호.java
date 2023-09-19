import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> stk = new Stack();
        
        for(char c : s.toCharArray()){
            if(c == '(')
                stk.push("(");
            
            if(c == ')'){
                if(stk.size() == 0)
                    return false;
                
                stk.pop();
            }
        }
        
        if(stk.size() > 0)
            return false;
        
        
        return true;
    }
}