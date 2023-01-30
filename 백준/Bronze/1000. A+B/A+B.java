
import java.util.Scanner;

public class no_1000 {
    public static void main(String[] args) {
        long a = 0;
        long b = 0;

        Scanner scanner = new Scanner(System.in);
        //System.out.print("A : ");
        a = scanner.nextLong();

        //System.out.print("B : ");
        b = scanner.nextLong();

        sum(a, b);
    }

    public static void sum(long a, long b){
        System.out.println(a + b);
    }
}
