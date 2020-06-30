import java.util.Random;

public class Pirate {
    String name;
    int rums;
    boolean isDead;
    boolean isCaptain;

    public Pirate(String name) {
        this.name = name;
        this.rums = 0;
        this.isCaptain= false;
        this.isDead = false;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public void drinkSomeRum(){
        if (!this.isDead){
            if (this.rums<=4){
                this.rums++;
            }else
                die();
            System.out.println("He is dead");
        }
    }

    public void howItGoingMate(){
        if (!this.isDead){
            if (this.rums<=4){
                System.out.println("Pour me anudder!");
                this.rums++;
            }else
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                die();
            System.out.println("He is dead");
        }
    }

    public boolean die(){
        return this.isDead=true;
     }

     public void brawl(Pirate enemy){
         Random rand = new Random();
         int chance = rand.nextInt(2);
         if (!this.isDead && !enemy.isDead){
             if (chance == 0){
                 this.isDead=true;
             }else if (chance == 1){
                 enemy.isDead=true;
             }else{
                 this.isDead=true;
                 enemy.isDead=true;
             }
         }
     }
}
