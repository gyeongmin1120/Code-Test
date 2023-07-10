import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list = new ArrayList(Arrays.asList(answer));
        
        list.removeAll(Arrays.asList(""));
        
        answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}
