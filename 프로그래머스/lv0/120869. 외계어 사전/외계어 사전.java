import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
       int answer = 2;

        String spellStr = Arrays.toString(spell).replaceAll("[^a-zA-Z]", "");

        char[] arr = spellStr.toCharArray();
        Arrays.sort(arr);
        spellStr = new String(arr);

        for(String ds : dic){
            char[] dsArr = ds.toCharArray();
            Arrays.sort(dsArr);
            ds = new String(dsArr);

            if(ds.equals(spellStr)){
                answer = 1;
                break;
            }
        }

        return answer;
    }
}