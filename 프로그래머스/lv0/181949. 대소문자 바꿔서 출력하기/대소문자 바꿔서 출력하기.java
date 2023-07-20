import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        
        for(char c : str.toCharArray()){
            if(c >= 97) System.out.print((char)(c - 32));
            else System.out.print((char)(c + 32));
        }
    }
}
