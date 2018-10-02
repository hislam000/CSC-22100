/*
 * @author Hasibul Islam
 */
//package project4;
public class Herbivore extends Animal {

     public static final int PLANTS = 1;
     public static final int LIFE= 20;


    private int energy ;


    public void update(Organism[] carni_animal){

        int j;
        for(j=0; j<carni_animal.length;j++)
        {
            if(carni_animal[j]!=null)
             {
                if (carni_animal[j].getClass() == Plant.class) 
                {
                    energy++; break;
                }
            }
            else if(j==7)
            
            { 
                 setLife(false); 
              }

        } 
          if( (g_Age() == PLANTS) || (energy == LIFE) )
        { 
             setLife(false);
        }
    }
  

    public String toString()
    {
        return String.format("&");
    }
}
