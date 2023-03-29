class Solution {
    public long solution(String numbers) {
        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<array.length; i++){
            numbers = numbers.replaceAll(array[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}