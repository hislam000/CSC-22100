/*
 * @author Hasibul Islam
 */
//package project4;
public abstract class Animal extends Organism{
        
        private int allow_Age = 0;

        public void update(Organism[] carni_animal) {
            allow_Age++;
    }
          public int g_Age(){  
                return allow_Age; 
            }

}
