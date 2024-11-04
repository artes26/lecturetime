package company;

import java.util.Scanner;


public class cwh_05_userinput {

    public static void main(String[] args) {
//        System.out.println("Taking input from user !");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter num 1 ");
//        int a = sc.nextInt();
//        //  float a = sc.nextFloat();
//
//        System.out.println("Enter num 2 ");
//        int b = sc.nextInt();
//        // float b= sc.nextFloat();
//
//
//       // float sum = a +b;
//        int sum = a +b ;
//
//
//        System.out.println("the sum of num");
//        System.out.println(sum);

//
//        System.out.println("check int is or not ");
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("That's not a valid integer.");


         }


    }
}
