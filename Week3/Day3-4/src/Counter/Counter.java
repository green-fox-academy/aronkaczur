package Counter;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class Counter {
    public int counterNumber;
    public int initialvalue;


    public Counter(int counterNumber) {
        this.counterNumber = counterNumber;
        this.initialvalue = counterNumber;
    }

    public Counter(){
        this.counterNumber = 0;
        this.initialvalue = 0;

    }
    public void add(int number) {
        this.counterNumber += number;
    }
    public void add(){

        this.counterNumber++;
    }
    public int get() {
        return this.counterNumber;
    }

    public void reset() {
        this.counterNumber = this.initialvalue;
    }


}