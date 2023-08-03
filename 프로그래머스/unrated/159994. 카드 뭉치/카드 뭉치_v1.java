import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        ArrayList list1 = new ArrayList(Arrays.asList(cards1));
        ArrayList list2 = new ArrayList(Arrays.asList(cards2));
        
        for(int i = 0; i < goal.length - 1; i++){
            String list = "";
            
            if(list1.contains(goal[i]) && list1.contains(goal[i+1]))
                list = "list1";
            
            if(list2.contains(goal[i]) && list2.contains(goal[i+1]))
                list = "list2";
            
            
            if(list.equals("list1") 
               && list1.indexOf(goal[i+1]) - list1.indexOf(goal[i]) != 1){
                answer = "No";
                break;
            }
               
            if(list.equals("list2") 
               && list2.indexOf(goal[i+1]) - list2.indexOf(goal[i]) != 1){
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
