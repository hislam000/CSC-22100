
//09/22/2017-> CSC221
//Assignment 1: Hasibul Islam

import java.util.Scanner; //Program uses class Scanner

public class Complex {
    private double Real_part; //Real
    private double Imag_part; //Imaginary

    public Complex() {
        Real_part = 0;
        Imag_part = 0;
    }

    public Complex(double r, double i) {
        Real_part = r;
        Imag_part = i;
    }

    // Accesors
    public double getReal_part() {
        return Real_part;
    }

    //Mutators
    public void setReal_part(double Real_part) {
        this.Real_part = Real_part;

    }

    //Accesors
    public double getImag_part() {
        return Imag_part;
    }

    //Mutators
    public void setImag_part(double Imag_part) {
        this.Imag_part = Imag_part;
    }

    public void print() {
        if (getImag_part() >= 0)
            System.out.print(getReal_part()
             + "+" + getImag_part() + "i");
        else
            System.out.print(getReal_part()
                    + getImag_part() + "i");
    }
    //
    public static void main(String[] args) {
        //Create a Scanner to obtain input from in the command window
        Scanner input = new Scanner(System.in);

        Complex result = new Complex();

        //prompt
        System.out.print("r:"); // "r:" -> real
        double variable1 = input.nextDouble(); //obtain user input
        result.setReal_part(variable1);

        System.out.print("i: " + "i"); // "i:"-> Imaginary
        double variable2 = input.nextDouble(); //obtain user input
        result.setImag_part(variable2);

        //Display
        System.out.printf("Real %n%f%n",
                result.getReal_part());
        System.out.printf("Imaginary %n%f%n",
                result.getImag_part());


    }
}
