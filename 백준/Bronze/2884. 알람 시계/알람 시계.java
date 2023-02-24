import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m - 45 < 0){
            h -= 1;
            m = 60 + (m - 45);

            if(h < 0){
                h = 24 + h;
            }
        } else {
            m = m - 45;
        }

        System.out.print( h );
        System.out.print( " " );
        System.out.print( m );
    }
}
