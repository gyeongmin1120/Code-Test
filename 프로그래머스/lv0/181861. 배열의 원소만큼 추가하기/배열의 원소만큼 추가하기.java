import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        StringBuffer nStr = new StringBuffer();

        for(int i : arr){
            for(int j = 0; j < i; j++){
                nStr.append(i + ",");
            }
        }

        return Arrays.stream(nStr.toString().split(",")).mapToInt(Integer::parseInt).toArray();
    }
}
