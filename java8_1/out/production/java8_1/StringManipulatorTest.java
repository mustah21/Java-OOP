package production.java8_1;

import Task2.StringManipulator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    @Test
    void testStringManipulator() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello world", sm.concatenate("hello", " world"));
    }

    @Test
    void testFindLength(){
        StringManipulator sm = new StringManipulator();
        assertEquals(17, sm.findLength("hello how are you"));
    }
    @Test
    void TestUpperCase(){
        StringManipulator sm = new StringManipulator();
        assertEquals("METROPOLIA", sm.convertToUpperCase("mEtrOpolia"));
    }
    @Test
    void TestLowerCase(){
        StringManipulator sm = new StringManipulator();
        assertEquals("metropolia", sm.convertToLowerCase("mEtrOpOlIa"));
    }

    @Test
    void TestContainsSubString(){
        StringManipulator sm = new StringManipulator();
        assertEquals(true, sm.containsSubString("My name is mustafa", "mustafa"));
    }


}
