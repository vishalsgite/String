import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Return null character if no unique character
    }

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(str));
    }
}
