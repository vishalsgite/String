public class StartsWith {
    public static boolean startsWith(String str, String prefix) {
        return str.startsWith(prefix);
    }

    public static void main(String[] args) {
        String str = "Java programming";
        System.out.println("Starts with 'Java'? " + startsWith(str, "Java"));
    }
}
