public class ReverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Interview";
        System.out.println("Reversed string: " + reverse(str));
    }
}
