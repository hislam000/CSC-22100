 /*
 * @author Hasibul Islam
 */
 //package project4;
 public abstract class Organism {
     
    private boolean org_life=true;

     public void setLife(boolean org_life){
         this.org_life = org_life;
     }
     public boolean isorg_Life()
      { 
            return org_life; 
        }
abstract void update(Organism[] carni_animal);
    
 }