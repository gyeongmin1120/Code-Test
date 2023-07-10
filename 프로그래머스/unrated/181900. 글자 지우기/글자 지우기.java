class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = 0; i < my_string.length(); i++){
            if(!contains(indices, i)) answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
    
    public boolean contains(int[] arr, int i){
        for(int k : arr){
            if( k == i) return true;
        }
        
        return false;
    }
}