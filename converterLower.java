import java.io.FilterOutputStream;
import java.util.Scanner;

public class converterLower {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);

        if (ch >= 'A' && ch <='Z') {
            char result = Character.toLowerCase(ch);
            System.out.println(result);
        }
        else {
            char result = Character.toUpperCase(ch);
            System.out.println(result);
        }






    }
}
