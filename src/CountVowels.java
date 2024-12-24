public class CountVowels {
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("Vowel count: " + countVowels(str));
    }
}
