class Solution {
    public int solution(int n) {
         int answer = 0;
        
         for(int i=2; i<=n; i++){
             boolean flag = true;
             
             for(int j = 2; j <= Math.sqrt(i); j++) {
                 //소수가 아님
                 if(i%j == 0)  { 
                    flag = false;
                    break; 
                  } 
               }
             
              if(flag==true) answer++; 
        }
       return answer;
    }
    
}