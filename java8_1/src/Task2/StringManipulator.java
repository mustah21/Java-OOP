package Task2;

public class StringManipulator {

    public String concatenate(String string1, String string2) {
        return string1 + string2;
    }
    public int findLength(String string) {
        return (string.length());
    }

    public String convertToUpperCase(String string) {
        return string.toUpperCase();
    }
    public String convertToLowerCase(String string) {
        return string.toLowerCase();
    }
    public boolean containsSubString(String string, String substring) {
        return string.contains(substring);
    }

}
