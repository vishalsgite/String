public class EndsWith {
    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }

    public static void main(String[] args) {
        String str = "Java programming";
        System.out.println("Ends with 'ing'? " + endsWith(str, "ing"));
    }
}
