public class CharIndex {
    public static int findCharIndex(String str, char ch) {
        return str.indexOf(ch);
    }

    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("Index of 'P': " + findCharIndex(str, 'P'));
    }
}
