import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        //version 1
//         ArrayList<Integer> list = new ArrayList();
        
//         for(int i = intervals[0][0]; i <= intervals[0][1]; i++)
//             list.add(arr[i]);
        
//         for(int i = intervals[1][0]; i <= intervals[1][1]; i++)
//             list.add(arr[i]);
        
//         return list.stream().mapToInt(i -> i).toArray();
        
        
        return IntStream.concat(IntStream.of(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1)), IntStream.of(Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1))).toArray();
        
    }
}