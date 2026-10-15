import java.util.Scanner;

public class upperClass {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = check(str);
        System.out.println(result);


    }

    static boolean check (String A) {
        for(int i=0; i<A.length(); i++) {
            char ch = A.charAt(i);

            if (ch >= 65  && ch <=90){
                return true;
            }
        }


        return false;
    }


}
