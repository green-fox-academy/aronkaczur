package Farm;

public class Animal {
    private int hunger = 50;
    private int thirst = 50;
    private String name;

    public Animal(int hunger, int thirst, String name){
        this.hunger=hunger;
        this.thirst=thirst;
        this.name=name;
    }
    public void eat(){
        this.hunger--;
    }
    public void drink(){
        this.thirst--;
    }
    public void play(){
        this.hunger++;
        this.thirst++;
        System.out.println("Gametime");
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

}
