public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String str = "Java programming interview";
        System.out.println("Reversed words: " + reverseWords(str));
    }
}
