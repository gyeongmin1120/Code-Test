import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList();
        int length = my_string.length();
        
        for(int i = length; i >= 0; i--){
            if(!my_string.substring(i, length).equals(""))
                 list.add(my_string.substring(i, length));
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}