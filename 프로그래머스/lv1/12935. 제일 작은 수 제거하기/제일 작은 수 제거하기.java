import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        //object로 반환되어서 인덱스가 아닌 값으로 인식
        list.remove(Collections.min(list));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}