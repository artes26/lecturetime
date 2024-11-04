//  Q -  WRITE  PROGRAM TO CALCULATE PERCENTAGE OF 5 SUBJECT
//       TAKEN AS INPUT FROM KEYWORD/USER

package company;

import java.util.Scanner;

public class exersie_1_cwh {
    public static void main(String[] args) {
        System.out.println("percentage calculatorr");
        Scanner ac = new Scanner(System.in);

        System.out.println("makrs of sub 1 ");
        float a = ac.nextFloat();
        System.out.println("makrs of sub 2");
        float b = ac.nextFloat();
        System.out.println("makrs of sub 3");
        float c = ac.nextFloat();
        System.out.println("makrs of sub 4");
        float d = ac.nextFloat();
        System.out.println("makrs of sub 5");
        float e = ac.nextFloat();
        System.out.println("out of total marks?");
        float f =ac.nextFloat();
        float tmo = a+b+c+d+e;
        float per = ((tmo*100)/f);
        System.out.println("your percentage is ");
        System.out.println(per);
    }
}




//1 - playing candidates name ?
//2 - piking random name
//3 - asking candidate to choose truth/ dare?
//4 -  pick random question from direcory on the basis of thier choise