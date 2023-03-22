class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int arr : array){
            char[] cArr = String.valueOf(arr).toCharArray();
            
            for(char c : cArr){
                if (c == '7') answer++;
            }
        }
        return answer;
    }
}