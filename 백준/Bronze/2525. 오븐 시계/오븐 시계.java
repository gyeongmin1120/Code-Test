import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int cook = scanner.nextInt();

        int total = 60 * h + m + cook;

        h = total / 60;
        m = total % 60;

        if(h >= 24){
            h = h -24;
        }

        System.out.println(h + " " + m);
    }
}
