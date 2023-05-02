import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        for(int i = 1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + Integer.parseInt(n)*i);
        }

    }
}
