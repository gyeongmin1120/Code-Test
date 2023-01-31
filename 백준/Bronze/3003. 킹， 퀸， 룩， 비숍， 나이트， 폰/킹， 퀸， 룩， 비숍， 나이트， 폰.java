import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int arr[] = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < arr.length; i++){
           sb.append(arr[i] - Integer.parseInt(tokenizer.nextToken())).append(" ");
        }

        br.close();
        
        System.out.println(sb);
    }
}
