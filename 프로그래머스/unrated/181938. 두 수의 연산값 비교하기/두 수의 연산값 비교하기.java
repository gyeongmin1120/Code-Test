class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        
        int n = Integer.parseInt(sb.toString());
        
        return n >= 2 * a * b ? n : 2 * a * b;
    }
}