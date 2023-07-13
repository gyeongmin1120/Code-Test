import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList();
        
        switch(n){
            case 1 : answer = slice(0, slicer[1], 1, num_list); break;
            case 2 : answer = slice(slicer[0], num_list.length - 1, 1, num_list); break;
            case 3 : answer = slice(slicer[0], slicer[1], 1, num_list); break;
            case 4 : answer = slice(slicer[0], slicer[1], slicer[2], num_list); break;
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public List<Integer> slice(int start, int end, int interval, int[] num_list){
        List<Integer> list = new ArrayList();
        
        for(int i = start; i <= end; i+=interval){
            list.add(num_list[i]);
        }
        
        return list;
    }
}