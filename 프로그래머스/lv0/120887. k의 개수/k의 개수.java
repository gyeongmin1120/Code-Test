class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int s = i; s <= j; s++){
            String str = String.valueOf(s);
            answer += str.length() - str.replace(String.valueOf(k), "").length();
        }
        return answer;
    }
}