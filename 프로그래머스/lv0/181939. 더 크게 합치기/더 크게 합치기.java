class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder ab = new StringBuilder();
        StringBuilder ba = new StringBuilder();
        
        ab.append(a);
        ab.append(b);
        
        ba.append(b);
        ba.append(a);
        
        return 
            Integer.parseInt(ab.toString()) < Integer.parseInt(ba.toString()) ? 
            Integer.parseInt(ba.toString()) : Integer.parseInt(ab.toString());
    }
}
