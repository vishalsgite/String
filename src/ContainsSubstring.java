public class ContainsSubstring {
    public static boolean contains(String str, String target) {
        return str.contains(target);
    }

    public static void main(String[] args) {
        String str = "Welcome to Java programming";
        String target = "Java";
        System.out.println("Contains 'Java'? " + contains(str, target));
    }
}
