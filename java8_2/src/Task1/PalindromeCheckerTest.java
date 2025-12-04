package Task1;

public class PalindromeCheckerTest {

    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return word.contentEquals(sb);
    }
}