import java.util.Scanner;

public class stringBasic {
    static void main(String[] args) {

        // String - Collection of characters inside the "" is called String.
        // Character - A single alphabet is the ' ' code called Charter.

        /*
        Datatype - 2types
            1. Primitive datatype - Memory fuction is less
                A. int
                B. double
                C. Float
                D. Long
                E. byte
                F. boolean
            2. Non Primitive datetype - Memory function is more.
                A. char
                B. String
                C. Array.
                D. Class and Objects
         */

        String a = "Deep";
        char b = 'D';

        System.out.println(a + b);


        /* Char is 4type -   [ 128 char ]
            1. Upper case
            2. Lower Case
            3. Special Char
            4. Symbols.
         */

        // ASCII code.

        // 1. Upper case [ A - Z] - 65 to 90.
        // A ->65; B ->66 .....Z -> 90
        // 2. Lower case - [97 - 122]
        // 3. Special char  - [48 - 57]

        char num = 'a' + 3;  // Implicit typecasting
        char num1 = 'A';
        System.out.println(num);
        System.out.println(num1 + num1);


        /*
        Range or Value -  10
        index - n-1;

         */

        String x = "Hello Emon";
        System.out.println(x.charAt(2));
        System.out.println(x.length());

        // Substring (0,18)

        String y = "Hello Coders I m the best Developer";
        System.out.println(y.substring(6, 10));

        String z = "       I m the best Developer    ";
        System.out.println(z.trim());

// ## .contain
        String name = "hello World";
        boolean check = name.contains("world"); // .contain is checking the World in the name variables.
        System.out.println(check);



  /*
        How String works in memory

        String a = "Deep";
        String b = "Deep";

        a == b; True -> False\

        ## String Pool -> It's a seperate memory structure inside the Heap memory.

        ## Heap memory -> A large share region of a computer memory used for dynamic memory allocation.

        ** Use case - All the similar values of String are recreated.
         */

        // EXAMPLE -

        String k = "Deep";
        String l = "Deep";

        /*
        What if changing "k" will be reflected same in l ??
        => No it will not change if k change value because of Immutability. String is
         Immmutability in Java because of Security.
         */

        String str = "Deep"; // Garbage will clean the Deep.
        str = "Ghosh";

          /* Why we modify the String Object ??
                per1 ="Deep"
                per2 = "Deep"
                Per 3 = "Deep"

                per1= "Ghosh" // Heap memory will allocate the seperate Pool memory. where
                per2 & per3 in same pool memory but per1 will have seperate memory.
           */

        // String Compriosn :
        /*
            1. == method [Comparison]
            checking if refrence variable are pointing same object


            2. How to create different object in same value !

                String a = new String ("Deep");
                String b = new String ("Deep");

              ** This case value is created outside the pool but inside heap.
              where in this case a == b is false beacuse they created in the heap memory
              even if they have same value.


              ## .equal method

              case 1 =>  It will True
                string a = "Deep";
                String b = "Deep";

              Case 2 => It will false
                String a = new String ("Deep");
                String b = new String ("Deep");

                sopln (a.equals(b));  -> Calling Method
                sopln (a.equals(b));  -> comparion
         */



        /*
        ## Concatenation

        String series = "";
            for (int i =0; i<26; i++ ) {

                char ch = (char) ('a' + i ); // Explacit nature int to char.
                sopln (ch);
            }

            Output Note
                New object is creating everytime beacause is immutability.


         */

        String series = "";
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i); // Explicit nature int to char.
            System.out.print(ch + " ");





        }

        /* String Buidler Class
        => Mutable string class for Java

        ## StringBuilder nameOfObject = new stringbuidler ();

       => To covert stringBuilder to string
       => nameOfObject.toString.



         */

    }
}
