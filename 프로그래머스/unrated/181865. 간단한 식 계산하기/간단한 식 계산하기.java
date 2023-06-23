class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");
        
        if("+".equals(arr[1])) answer = Integer.parseInt(arr[0]) +  Integer.parseInt(arr[2]);
        else if("-".equals(arr[1])) answer = Integer.parseInt(arr[0]) -  Integer.parseInt(arr[2]);
        else if("*".equals(arr[1])) answer = Integer.parseInt(arr[0]) *  Integer.parseInt(arr[2]);
        
        return answer;
    }
}