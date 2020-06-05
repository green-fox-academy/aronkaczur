import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test
    public void firstTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Sum.fill(numbers);
        assertEquals(55,Sum.sumOfElements(numbers));
    }

    @Test
    public void secondTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(0,Sum.sumOfElements(numbers));
    }

    @Test
    public void thirdTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        assertEquals(2,Sum.sumOfElements(numbers));
    }

    @Test
    public void fourthTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Sum.fill(numbers);
        assertEquals(55,Sum.sumOfElements(numbers));
    }

    @Test
    public void fifthTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        assertEquals(0,Sum.sumOfElements(numbers));
    }
}