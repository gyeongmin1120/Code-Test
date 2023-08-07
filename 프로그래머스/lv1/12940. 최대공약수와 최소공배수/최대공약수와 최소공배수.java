class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = (n < m) ? n : m;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (n % i == 0 && m % i == 0)
				gcd = i;
		}
        
        //최대공약수 : 최소값과 같거나 작은 수 들 중에서 둘 다 나눌 수 있는 수
        answer[0] = gcd;
        //최소공배수 : 두 수를 곱해서 최대공약수로 나눈 값
        answer[1] = n * m / gcd;
        
        return answer;
    }
}