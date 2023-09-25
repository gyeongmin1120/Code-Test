class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            fibo(i, arr);
        }
        
        return arr[n];
    }
    
    public void fibo(int x, int[] arr){
        if(x == 0 || x == 1)
            arr[x] = x;
        else
            arr[x] = (arr[x-1] + arr[x-2]) % 1234567;
    }
}