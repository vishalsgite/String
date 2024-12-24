public class RemoveSpaces {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println("String without spaces: '" + removeSpaces(str) + "'");
    }
}
