class Solution {
    public int solution(int price) {
        int answer = 0;
        double percent = 0.0;
        
        if( price >= 100000 && price < 300000){
            percent = 0.05;
        } else if(price >= 300000 && price < 500000){
            percent = 0.1;
        }else if(price >= 500000){
            percent = 0.2;
        }
        
        
        return (int)(price * (1 - percent));
    }
}