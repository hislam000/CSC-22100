/*
 * @author Hasibul Islam
 */
//package project4;
public class Carnivore extends Animal  {

     public static final int LIFE = 16;
    public static final int MAX = 4;

    private int carniCount;
    private int energy;
    

    public void update(Organism[] carni_animal) {

        int j;
        for (j=0;j<carni_animal.length;j++)
        {
            if(carni_animal[j] instanceof Animal)
            {
                carniCount=0;
                break;
            }
            else if(j==7)
            { 
                carniCount++;
             }
        } 
        
        if( (g_Age() == LIFE) || (carniCount == MAX) )
        { 
             setLife(false);
        }
    }
    
    public String toString()
    {
        return String.format("@");
    }

}
