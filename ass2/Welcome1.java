
/*
    10/08/2017
    Class: Software design lab-> CSC221
    Prof: Nooreddin Naghibolhosseini
    Hasibul Islam
*/
import java.util.Scanner;
public class Welcome1{

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
            int age;
            int r;
            String reason="y";
       while(reason.equals("y"))
       {
           System.out.print("Please enter your age: ");
            age = sc.nextInt();

            System.out.println("The result is: ");
            r = age;

            System.out.print(age+ ",");
            while (age!= 1) { age=age/2;
            
                if (age == 1)
                    System.out.print(age);
                else
                    System.out.print(age+ ",");

            }
           System.out.println();

            int a, i;
            for (a = 0; a < r; ++a) 
            {
                for (i = 0; i<= a; ++i) 
                 {
                    System.out.print("*");
                }
                System.out.println();
            }
           System.out.println("Do you want to contiue? (y/n)");
          
           reason= sc.next();
           if(reason.equals("n")) {
                System.out.print(("Goodbye!\n"));
               break; }
          
       }
      
      
   }

}