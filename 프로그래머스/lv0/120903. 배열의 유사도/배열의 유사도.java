import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> list1 = new ArrayList<>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<>(Arrays.asList(s2));
        
        list1.retainAll(list2);
        
        int answer = list1.size();
        
        return answer;
    }
}