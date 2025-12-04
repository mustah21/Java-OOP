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
    } // case insensitive

    @Test
    public void testNonPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertFalse(checker.isPalindrome("nurses run"));
    }


}
