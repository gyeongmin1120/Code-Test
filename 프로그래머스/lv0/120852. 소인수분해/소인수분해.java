import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList();
        
        for(int i = 2; i <= n ; i++)
            if(isPrime(i) && n % i == 0) list.add(i);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean isPrime(int i){
        for(int j = 2; j < i; j++)
            if(i % j == 0) return false;
        
        return true;
    }
}