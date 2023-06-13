import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        List<String> strList = new ArrayList<>(Arrays.asList(my_string.split(" ")));
        strList.removeAll(Arrays.asList(""));
                                    
        return strList.toArray(new String[strList.size()]);
    }
}
