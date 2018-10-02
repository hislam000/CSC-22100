/*
 * @author Hasibul Islam
 */
//package project4;
public class Plant extends Organism{ 

    public static final int ORGANISMS = 5;
    public static final int HERBIVORES = 2;

    public void update(Organism[] carni_animal)
     {
        int organsim_Count=0;
        int herbivore_Count=0;
        int j;

        for(j=0; j<carni_animal.length; j++)
        {
            if(carni_animal[j]!=null)
            {
                organsim_Count++;

                if(carni_animal[j].getClass() == Herbivore.class)
                {
                    herbivore_Count++;
                }
            }

        }
        if ((organsim_Count > ORGANISMS) ||(herbivore_Count>HERBIVORES)) 
        {
            setLife(false);
        }
    }

    public String toString()
    {
        return String.format("#");
    }

    
}
