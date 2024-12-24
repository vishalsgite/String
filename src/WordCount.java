public class WordCount {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "This is a test string";
        System.out.println("Word count: " + countWords(str));
    }
}
