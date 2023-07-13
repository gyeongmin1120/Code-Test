class Solution {
    public int[] solution(int[] arr) {
        
        int i = 0;
        int length = arr.length;
        
        while(i >= 0){
            if(length <= Math.pow(2, i))  break;
            else i++;
        }
        
        int[] answer = new int[(int)Math.pow(2, i)];
        
        for(int j = 0; j < length; j++){
            answer[j] = arr[j];
        }
        
        
        return answer;
    }
}
