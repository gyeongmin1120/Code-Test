import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultArr = new ArrayList();
        List<Integer> delArr = Arrays.stream(delete_list)        // IntStream
                                    .boxed()                     // Stream<Integer>
                                    .collect(Collectors.toList());
    
        for(int n : arr){
            if(!delArr.contains(n)) resultArr.add(n);
        }
        
        return resultArr.stream().mapToInt(i -> i).toArray();
    }
}