class Solution {
    public int[] solution(int money) {
        int cnt = money / 5500;
        int[] answer = {cnt, money - (cnt * 5500)};
        return answer;
    }
}