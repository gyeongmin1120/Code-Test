import java.time.LocalDate;

class Solution {
    private String[] arr = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        int day = date.getDayOfWeek().ordinal();
        return arr[day];
    }
}