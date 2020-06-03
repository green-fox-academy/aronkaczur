package Animal;

public class Animal {
    private int hunger = 50;
    private int thirst = 50;

    public int eat(){
        return this.hunger--;
    }
    public int drink(){
        return this.thirst--;
    }
    public int play(){
        return this.hunger++;
    }
}
