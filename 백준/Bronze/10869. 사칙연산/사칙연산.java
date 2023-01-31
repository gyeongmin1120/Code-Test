
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        plus(a, b);
        minus(a, b);
        multiple(a, b);
        divid(a, b);
        remainder(a, b);

    }

    public static void plus(int a, int b){
        System.out.println(a + b);
    }

    public static void minus(int a, int b){
        System.out.println(a - b);
    }

    public static void multiple(int a, int b){
        System.out.println(a * b);
    }

    public static void divid(int a, int b){
        System.out.println((int) a / b);
    }

    public static void remainder(int a, int b){
        System.out.println(a - (int) b * (a / b));
    }
}
