class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        //이진수 자릿수 설정
        String fmt = "%0" + n + "d";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr1.length; i++){
            String map1 = String.format(fmt, Long.parseLong(Integer.toBinaryString(arr1[i])));
            String map2 = String.format(fmt, Long.parseLong(Integer.toBinaryString(arr2[i])));
            
            //두 개 지도 더한 값
            String num = String.format(fmt, (Long.parseLong(map1) + Long.parseLong(map2)));
            
            for(char c : num.toCharArray()){
                if(Long.parseLong(String.valueOf(c)) >= 1 )
                    sb.append("#");
                else
                    sb.append(" ");
            }
            
            answer[i] = sb.toString();
            
            //StringBuilder 초기화
            sb.setLength(0); 
        }
        
        return answer;
    }
}