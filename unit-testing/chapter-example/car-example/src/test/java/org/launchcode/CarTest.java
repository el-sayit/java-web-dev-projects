package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    Car test_car;
    @BeforeEach
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);

    }
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(),.001);
    }
    @Test
    public void testInitialGasTankUsingFalse(){
        assertFalse(test_car.getGasTankLevel()==0, "getGasTankLevel() expected to be false when comparing to 0");
    }
    @Test
    public void testInitialGasTankTrue(){
        assertTrue(test_car.getGasTankLevel()==0, "getGasTankLevel() expected to be true when comparing to 0");
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testTankLevelDrivingTankRange(){

    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}