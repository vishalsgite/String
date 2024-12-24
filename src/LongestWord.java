public class LongestWord {
    public static String longestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String str = "I love programming in Java";
        System.out.println("Longest word: " + longestWord(str));
    }
}
