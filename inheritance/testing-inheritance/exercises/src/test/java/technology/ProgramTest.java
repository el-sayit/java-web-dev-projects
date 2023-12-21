package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }
    @Test
    public void inheritsSuperInFirstConstructor(){
        Laptop laptop2 = new Laptop("HP", 14, "Integrated");
        assertEquals(14,laptop2.getScreenSize());
    }
    @Test
    public void inheritsSuperInFirstConstructorOfSmartphone(){
        SmartPhone smartPhone1 = new SmartPhone("Apple", 5,"none");
        assertEquals("Apple", smartPhone1.getBrandName());
    }
}
