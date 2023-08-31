class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int i = 0;
        int length = nums.length - 1;
        
        while(i <= length - 2){
            for(int j = length; j > 1; j--)
                for(int k = i + 1; k < j; k++)
                    if(vaild(nums[i] + nums[k] + nums[j]))
                        answer++;
                
            i++;
        }
        
        return answer;
    }
    
    
    public boolean vaild(int n){
        for(int i = 2; i < n/2 ; i++){
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
    
}