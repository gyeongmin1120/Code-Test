import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = numbers.length - 1; j > i; j--){
                int sum = numbers[i] + numbers[j];
                
                if(!list.contains(sum)) list.add(sum);
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}