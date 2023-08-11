class Solution {
    public int solution(int[][] sizes) {
        int min = 0;
        int max = 0;
        
        for(int[] size : sizes){
            int sMax = Math.max(size[0], size[1]);
            int sMin = Math.min(size[0], size[1]);
            
            min = Math.max(sMin, min);
            max = Math.max(sMax, max);
        }
        
        return min * max;
    }
}