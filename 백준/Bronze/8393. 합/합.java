import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n =  Integer.parseInt(br.readLine());

        while(n > 0){
            result += n;
            n--;
        }

        System.out.println(result);

    }
}
