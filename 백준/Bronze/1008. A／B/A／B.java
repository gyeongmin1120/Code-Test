import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long a = 0;
        long b = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();

        divid(a, b);
    }

    public static void divid(long a, long b){
        Double result = (double) a / b;
        System.out.println(result);
    }
}