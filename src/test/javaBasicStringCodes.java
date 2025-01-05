package test;

public class javaBasicStringCodes {


    public static void usingCharArray(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end ){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        // Convert the char array back to a string and print
        String reversedStr = new String(charArray);
        System.out.println(reversedStr);

    }

    public static boolean palindromeString(String str){
        String str1 = str;
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end ){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversedString = new String(charArray);
        return reversedString.equals(str1);
    }
    public static String longestPalindrome(String str) {
        int n = str.length();
        String longest = "";

        // Iterate over all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);

                // Check if the current substring is a palindrome
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }

        return longest;
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static String usingStringBuilder(String str){
        String reversedString = new StringBuilder(str).reverse().toString();
        return reversedString;
    }

    public static String reversedOrderOfString(String str){
        String[] words = str.split(" ");              // Split the string into words

                  // Reverse the words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // Join the words back into a string

        String reversed = String.join(" ", words);
        return reversed;

    }

    public static void countOccurenceOfChars(String str){
        str = str.toLowerCase(); // Convert the string to lowercase for case insensitivity

        int end = str.length();
        boolean[] visited = new boolean[end];

        for(int i=0; i< end ; i++){
            if(visited[i] || str.charAt(i) == ' ' ){
                continue;
            }

            int count = 1;
            for(int j=i+1; j<end; j++){

                char c = str.charAt(i);
                char targetChar = str.charAt(j);
                if(c != ' ' &&  c == targetChar){
                       count++;
                       visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " : " + count);
        }
    }

    public static void countWords(String str) {
        str = str.trim();  // Remove leading and trailing spaces

        // If the string is empty, return 0
        if (str.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        int wordCount = 0;
        int end = str.length();
        boolean[] visited = new boolean[end];

        for (int i = 0; i < end; i++) {
            // Skip already visited characters and spaces
            if (visited[i] || str.charAt(i) == ' ') {
                continue;
            }

            wordCount++;  // Start of a new word

            // Mark all characters in the current word as visited
            for (int j = i + 1; j < end; j++) {
                if (str.charAt(j) == ' ') {
                    break;
                }
                visited[j] = true;
            }
        }

        System.out.println("Word count: " + wordCount);
    }
    public static void countNumberOfCharacters(String str) {
        str = str.replaceAll("\\s", "");  // Remove spaces from the string

        int count = str.length();  // Count the number of characters after removing spaces

        System.out.println("Number of characters (excluding spaces): " + count);
    }

    public static String removeDuplicateChars(String str) {
        str = str.toLowerCase();  // Convert the string to lowercase for case insensitivity

        int end = str.length();
        boolean[] visited = new boolean[end];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < end; i++) {
            if (visited[i] || str.charAt(i) == ' ') {
                continue;
            }

            char currentChar = str.charAt(i);
            result.append(currentChar);

            // Mark this character as visited
            for (int j = i + 1; j < end; j++) {
                if (str.charAt(j) == currentChar) {
                    visited[j] = true;
                }
            }
        }

        return result.toString();  // Return the string without duplicates
    }


    public static char mostFrequentCharacter(String str){
        str = str.toLowerCase();

        int end = str.length();
        boolean[] visited = new boolean[end];
        int maxCount = 0; // To store the highest occurrence count
        char mostFrequentChar = '\0'; // To store the most frequent character

        for(int i=0; i<end ; i++){
            if(visited[i] || str.charAt(i) == ' '){
                continue;
            }

            int count = 1;
            for(int j=i+1; j<end; j++){
                char c = str.charAt(i);
                char targetChar = str.charAt(j);
                if(c != ' ' && c == targetChar){
                    count++;
                    visited[j] = true;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mostFrequentChar = str.charAt(i);

            }
        }
        return mostFrequentChar;
    }


    public static void findFirstNonRepeatedChar(String str){
        str = str.toLowerCase();

        int end = str.length();
        boolean[] isVisied = new boolean[end];

        for(int i=0; i < end ; i++){
            if(isVisied[i] || str.charAt(i) == ' '){
                continue;
            }

            int count =1;
            for(int j=i+1;j<end;j++){
                char c = str.charAt(i);
                char targetChar = str.charAt(j);
                if( c !=' ' && c == targetChar){
                    count++;
                    isVisied[j] = true;
                }

            }

            if(count == 1){
                System.out.println("First non-repeated character: " + str.charAt(i));
                return;
            }
        }
        // If no non-repeated character is found
        System.out.println("No non-repeated character found.");
    }
    public static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase();  // Convert string to lowercase for case insensitivity

        int vowelsCount = 0;
        int consonantsCount = 0;
        int end = str.length();
        boolean[] isVisited = new boolean[end];

        for (int i = 0; i < end; i++) {
            if (isVisited[i] || str.charAt(i) == ' ') {
                continue;
            }

            char currentChar = str.charAt(i);

            // Check if the character is a vowel or consonant
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelsCount++;
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                consonantsCount++;
            }

            // Mark the character as visited (skip further checks for the same character)
            isVisited[i] = true;
        }

        // Output the results
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Count consecutive occurrences of the character
            while (i + 1 < n && str.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }

            // Append the character and its count if the count is greater than 1
            compressed.append(currentChar);
            if (count > 1) {
                compressed.append(count);
            }
        }

        // Return the compressed string
        return compressed.toString();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare the sorted arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }



    public static void main(String[] args){
        String str = "HEllO Good Morning , How are you ?";
        String str1 = "iiigggiiii";
       // usingCharArray(str);
       // System.out.println(palindromeString(str1));
        //System.out.println(usingStringBuilder(str));
       // System.out.println(reversedOrderOfString(str));
       // countOccurenceOfChars(str);
       // System.out.println(mostFrequentCharacter(str));
       // findFirstNonRepeatedChar(str);
        countVowelsAndConsonants(str);

    }
}
