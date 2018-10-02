/*
 * @author Hasibul Islam
 */
//package project4;
//import java.util.Scanner;
public class Simulate { 
    //2-dimentional of grid of the Orginaism
    private Organism [][] grid;

    //counts of the number(life_time)
    private int life_time;

    public static void main(String[] args){
        //Simulate-> grid of 16x16
    Simulate inSimulation = new Simulate(16,16);
    System.out.println(inSimulation);
    inSimulation.print();
    
    //Simulates 32 life_time 
    int j;
    for(j=0; j<32; j++)
    {
        inSimulation.simulate();
        System.out.println(inSimulation);
        inSimulation.print();
        }
    }

    public Simulate(int horizontal, int vertical)
    {
        grid = new Organism[horizontal][vertical];
        initialize();
    }
    //become more popultion
    public void initialize()
        {
        life_time = 0;
        int horizontal;
        int vertical;
        for(horizontal = 0; horizontal<grid.length;horizontal++)
        {
            for(vertical=0; vertical<grid[horizontal].length;vertical++)
            {
                grid[horizontal][vertical] = new_Organism();
            }
        }
    }
    //create organism are plants(20%)
    // Herbivores(10%)
    //Cranivors 5%
    // no organism (65%) and retruns null 
    private Organism new_Organism()
            {
        Organism result = null;
        double number = Math.random();
    
        if(number<0.2)result = new Plant();
        else if(number<0.30)result = new Herbivore();
        else if(number<0.35)result = new Carnivore(); 
        return result;
    }
//element we call(initX,initY)
//
private Organism[] return_carniv(int initX, int initY)
{
    Organism[] carni_animal = new Organism[8];
    int java = 0;
    int horizontal;
    int vertical;
    for(horizontal=initX-1; horizontal<=initX+1;horizontal++)
    {
        for(vertical = initY -1; vertical<=initY+1;vertical++)
        {
            if(horizontal != initX ||   vertical != initY)
            {
    if((horizontal>=0 && horizontal<grid.length) &&(vertical>=0 && vertical<grid[horizontal].length))
                    carni_animal[java] = grid[horizontal][vertical];
                java++;
            }
        }
    }
    return carni_animal;
}

public void simulate()
 {
  int horizontal;
  int vertical;
    for (horizontal = 0; horizontal < grid.length; horizontal++)
     {
        for (vertical = 0; vertical < grid[horizontal].length; vertical++)
         {
             if (grid[horizontal][vertical] != null)
              {
                Organism[] carni_animal = return_carniv(horizontal, vertical);
                grid[horizontal][vertical].update(carni_animal);

            }
        }
    }
    int horizontal;
    int vertical;
    for(horizontal=0;rohorizontalw<grid.length;horizontal++)
    {
        for(vertical=0;vertical<grid[horizontal].length;vertical++)
        {
            if(grid[horizontal][vertical]==null)
            {
            grid[horizontal][vertical] = createOrganism();
            }
        }
    }

    int horizontal;
    int vertical;
    for(horizontal=0;horizontal<grid.length;horizontal++)
    {
        for(vertical=0;vertical<grid[horizontal].length;vertical++)
        {
          
    if(grid[horizontal][vertical]!=null && (! grid[horizontal][vertical].isLife()))
            {
            grid[horizontal][vertical] = null;
            }
        }
    }
    life_time++;
}
//in string is return the string of the two dimensional of grid
public String toString(){
    int horizontal;
    int vertical;
    for (horizontal = 0; horizontal < grid.length; horizontal++) 
    {
        if(horizontal%16 == 0 && horizontal !=0)
        {
            System.out.println("\n");
        }
        for (vertical = 0; vertical < grid[horizontal].length; vertical++)
         {
            if(vertical%16 == 0)
            {
                System.out.println("\n");
            }
            if(grid[horizontal][vertical]==null)
            {
                System.out.printf("-\t");
            }
            else {
                System.out.printf("%s\t", grid[horizontal][vertical].toString());
            }
        }
    }
    return String.format("");
}

public void print()
{
    System.out.printf("%d%n",life_time);
}

}


