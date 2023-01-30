
import java.util.Scanner;

public class no_10998 {
    public static void main(String[] args){
        long a = 0;
        long b = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();

        multiple(a, b);
    }

    public static void multiple(long a, long b){
        System.out.println(a * b);
    }
}
