class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 2*(k-1);
        
        if(numbers.length >= index){
            answer = numbers[index];
        }else{
            answer = numbers[index%numbers.length];
        }
        
        return answer;
    }
}