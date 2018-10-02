
/*
 10/19/2017
 Class: Software design lab-> CSC221
 Prof: Nooreddin Naghibolhosseini
 Hasibul Islam
 */
import java.util.Scanner;

public class Welcome1{
    public static void main(String[] args) {
        int w;
        boolean enter = true;
        String reason ;
        Scanner sc = new Scanner(System.in);
    while(enter){
        System.out.println("Please enter your age: ");
            w = sc.nextInt();
            p_Result(w);
        System.out.println("Do you want to continue? (Y/N)");
            reason = sc.next();

        if(reason.equals("N") || reason.equals("n")){

        System.out.print(("Goodbye!\n"));

                enter = false; }
        }
    }
   
 public static void p_divided(int w){
        while(w>= 1)
        {
            System.out.print(w + " ");
            w = w/2;
        }
        System.out.println();
    }

public static void p_Stars(int w){
        int i;
        int j;
        for(i =1; i<=w; ++i)
        {
            for(j = 1; j<=i; ++j)
            {
                System.out.print("*");
            }
            System.out.println(); 
         }
    }
public static void p_Result(int w){
        System.out.println("The result is: ");
        p_divided(w);
         p_Stars(w); 
          }
    
}