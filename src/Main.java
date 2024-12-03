import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//TIP To\<b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Reverse_A_Number();
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
//        Pattern5();
      int a =   getSecondLargest();
        System.out.println(a);
    }

    // Program to Reverse a Number
    public static void Reverse_A_Number(){
        int number = 10899;
        int reverse = 0;

        for(int i = 0;number > 0; i++){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        System.out.println(reverse);
    }

    // Program to Show Triangle Pattern
    public static void Pattern1() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

      for(int row=1; row <= number; row++){
          for (int col = 1; col <= row ; col++) {
              System.out.print("*");
          }
          System.out.println();
      }

    }

    // Program to Show Reverse Triangle Pattern
    public static void Pattern2() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int row=1; row <= number; row++){
            for (int col = number ; col >= row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Program to print triangle of numbers
    public static void Pattern3() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int row=1; row <= number; row++){
            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    // Program to print Alphabet Number Triangle of numbers
    public static void Pattern4() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int chat_num = 65;

        for(int row=1; row <= number; row++){
            for (int col = 1; col <= row ; col++) {

                System.out.print((char)chat_num);
                chat_num++;
            }
            System.out.println();
        }

    }

    // program challenged by Nitin Sahu Advance Pattern
    public static void Pattern5(){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }

            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print("X");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

    // program challenged by nitin sahu advance pattern challenge 2
    public static void Pattern6(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print("O");
            }

            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("O");
            }


            System.out.println();
        }
        for (int i = n -1; i > 0; i--) {

            for (int j = i; j <= n; j++) {
                System.out.print("O");
            }

            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }


            for (int j = n; j >= i; j--) {
                System.out.print("O");
            }

            System.out.println();
        }
    }


}
