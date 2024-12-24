public class StringToInt {
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println("Converted integer: " + stringToInt(str));
    }
}
