package ScannerClass;

    import java.util.*;

    public class ScannerClass {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }
    }

    //pt 2 of this assignment is below

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        if(scan.hasNextLine() || s.isEmpty()){
            s = scan.nextLine();


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}

