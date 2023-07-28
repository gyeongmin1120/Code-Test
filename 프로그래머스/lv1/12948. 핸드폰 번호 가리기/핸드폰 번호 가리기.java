class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        
        return 
            new StringBuilder()
            .append(phone_number.substring(0, length - 4).replaceAll("[0-9]", "*"))
            .append(phone_number.substring(length - 4, length))
            .toString();
    }
}