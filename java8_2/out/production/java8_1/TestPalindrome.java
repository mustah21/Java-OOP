package production.java8_1;

import Task1.PalindromeCheckerTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPalindrome {
    PalindromeCheckerTest checker = new PalindromeCheckerTest();

    @Test
    public void testSimplePalindrome() {
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertFalse(checker.isPalindrome("Madam"));
    } // case sensitive

    @Test
    public void testNonPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertFalse(checker.isPalindrome("nurses run"));
    }

//    @Test
//    public void testNoInputs(){
//        assertFalse(checker.isPalindrome(""));
//        assertFalse(checker.isPalindrome(" "));
//      //  assertFalse(checker.isPalindrome(null));
//    }

    @Test
    public void testPalindrome(){
        assertTrue(checker.isPalindrome("amanaplanacanalpanama"));
        assertTrue(checker.isPalindrome("racecar"));
        assertTrue(checker.isPalindrome("1234321"));
    }

}
