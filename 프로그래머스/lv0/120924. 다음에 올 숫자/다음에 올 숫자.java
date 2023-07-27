class Solution {
    public int solution(int[] common) {
        int first = common[1] - common[0];
        int second = common[2] - common[1];
        
        //등차수열
        if(first == second)
            return common[common.length-1] + first;
        //등비수열
        else
            return common[common.length-1] * (int)(second / first);
        
    }
}