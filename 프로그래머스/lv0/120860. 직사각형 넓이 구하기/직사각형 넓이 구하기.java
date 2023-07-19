class Solution {
    public int solution(int[][] dots) {
        int xMax = -256;
        int xMin = 256;
        
        int yMax = -256;
        int yMin = 256;
        
        for(int i = 0; i < dots.length; i++){
            xMax = Math.max(xMax, dots[i][0]);
            xMin = Math.min(xMin, dots[i][0]);
            
            yMax = Math.max(yMax, dots[i][1]);
            yMin = Math.min(yMin, dots[i][1]);
        }
       
        return (xMax - xMin) * (yMax - yMin);
    }
}