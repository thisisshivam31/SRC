// Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

import java.util.Scanner;
public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        System.out.println("Enter Second Number");
        Scanner SD = new Scanner(System.in);
        int b = SD.nextInt();
        System.out.println("Enter Third Number");
        Scanner SE = new Scanner(System.in);
        int c = SE.nextInt();
        System.out.println("Enter Fourth Number");
        Scanner SF = new Scanner(System.in);
        int d = SF.nextInt();
        if(a==b && b==c && c==d){
            System.out.println("All are Same");
        }
        else{
            System.out.println("All are Different");
        }
    }

}
