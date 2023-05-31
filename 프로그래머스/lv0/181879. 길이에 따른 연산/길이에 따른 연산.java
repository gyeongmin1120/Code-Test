class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int answer = length >= 11 ? 0 : 1;
        
        if(length >= 11){
            for(int num : num_list){
                answer += num;
            }
        }else{
            for(int num : num_list){
                answer *= num;
            }
        }
        
        return answer;
    }
}
