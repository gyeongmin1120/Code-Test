import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<String> list = new ArrayList();
        
        for(int i=0; i < flag.length; i++){
            if(flag[i]) list.add(String.valueOf(arr[i]).repeat(arr[i]));
            else{
                for(int j = arr[i]; j > 0; j--)
                    list.remove(list.size()+1);
            }
        }
        return list;
    }
}
