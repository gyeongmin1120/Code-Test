class Solution {
    public int solution(int balls, int share) {
        double t = 1;
        double b = 1;

        for(int i = balls; i >= 1; i--){
            if( i >= balls-share+1){

                t *= i;
            }

            if( i <= share){
                System.out.println("i = " + i);
                b *= i;
            }

        }

        return (int)(t/b);
    }
}