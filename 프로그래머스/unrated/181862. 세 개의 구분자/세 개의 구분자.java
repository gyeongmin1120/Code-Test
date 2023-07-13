import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        List<String> list = new ArrayList();
        
        for(String str : answer){
            if(!"".equals(str)) list.add(str);
        }
        
        if(list.size() == 0) list.add("EMPTY");
        
        return list.toArray(new String[list.size()]);
    }
}