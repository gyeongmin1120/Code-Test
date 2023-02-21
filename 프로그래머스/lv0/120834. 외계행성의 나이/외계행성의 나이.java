class Solution {
    public String solution(int age) {
        char[] ageArr = {'a','b','c','d','e','f',
                           'g','h','i','j','k','l',
                           'm','n','o','p','q','r',
                           's','t','u','v','w','x',
                           'y','z'};
       
        StringBuilder answer = new StringBuilder();
        char[] arr = (String.valueOf(age)).toCharArray();
        
        for(char c : arr){
            answer.append(ageArr[Character.getNumericValue(c)]);
        }
       
        return answer.toString();
    }
}