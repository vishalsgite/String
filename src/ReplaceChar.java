public class ReplaceChar {
    public static String replaceChar(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Replaced string: " + replaceChar(str, 'o', 'a'));
    }
}
