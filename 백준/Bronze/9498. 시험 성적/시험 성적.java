import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        char result =  ( score <= 100 && score >= 90) ? 'A'  :
                ( score <= 89 && score >= 80) ? 'B' :
                        ( score <= 79 && score >= 70) ? 'C' :
                                ( score <= 69 && score >= 60) ? 'D' : 'F';

        System.out.println(result);
    }
}
