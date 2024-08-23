package ru.topacademy;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
