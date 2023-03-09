class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        for(int arr : array){
            if(Math.abs(n - answer) > Math.abs(n - arr)){
                answer = arr;
            }else if(Math.abs(n - answer) == Math.abs(n - arr)){
                answer = answer <= arr ? answer : arr;
            }
        }
        return answer;
    }
}