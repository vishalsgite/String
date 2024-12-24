public class TrimSpaces {
    public static String trimSpaces(String str) {
        return str.trim();
    }

    public static void main(String[] args) {
        String str = "   Java Programming   ";
        System.out.println("Trimmed string: '" + trimSpaces(str) + "'");
    }
}
