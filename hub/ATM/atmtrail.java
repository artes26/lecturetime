package ATM;

import java.util.Scanner;

public class atmtrail {


    public static void main(String[] args) {

        //    id pass

        String username = "ayush";
     int userid = 123;
     int pass = 1234;
     String balance = "50000";


        System.out.println("good morning user ");
        Scanner ayu = new Scanner(System.in);
        System.out.println("user id ");
        int a = ayu.nextInt();
        System.out.println("pass");
        int b = ayu.nextInt();

        if (a==userid & b==pass)
            System.out.println("welcome " + username );
        else System.out.println("error");

        System.out.println("select option ");
        Scanner service = new Scanner(System.in);

        System.out.println("1 : check balance ");
        System.out.println("2 : withdrwal ");
        System.out.println("3 : deposite  ");
        System.out.println("4 : Exits ");

        int a1 = service.nextInt();
        if (a1==1) System.out.println(" your balance " + balance);
        if (a1==2) System.out.println(" enter the ammount you want to withdrwal");
        int amm = service.nextInt();
        System.out.println("succesfuly withdrwal " + amm + " rupees");







}
}
