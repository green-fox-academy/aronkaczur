package Animal;

public class Animal {
    private int hunger = 50;
    private int thirst = 50;

    public void eat(){
        this.hunger--;
    }
    public void drink(){
        this.thirst--;
    }
    public void play(){
        this.hunger++;
        this.thirst++;
    }
}
