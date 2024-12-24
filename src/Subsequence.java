public class Subsequence {
    public static boolean isSubsequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }
        return j == m;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabbcc";
        System.out.println("Is subsequence? " + isSubsequence(str1, str2));
    }
}
