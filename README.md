**What is String in Java**
Strings are sequences of characters in Java. You can create a string either using String Literals or with the new keyword. Java provides many methods for working with strings, such as equals(), replace(), substring(), toUpperCase(), and split().
 
 
 **Difference between str1 == str2 and str1.equals(str2)?**
== checks if both references point to the same memory location (reference comparison).
equals() compares the actual content (value comparison).
Example:
String str1 = new String("Scaler");
String str2 = new String("Scaler");
System.out.println(str1 == str2);  // false
System.out.println(str1.equals(str2));  // true


**Is String a Primitive or Derived Type in Java?**
Strings are derived data types in Java. They are objects created using the java.lang.String class and support many useful methods for string manipulation.


**Difference between String in C and String in Java:**
In C: Strings are arrays of characters terminated by a null character (\0).
In Java: Strings are objects of the java.lang.String class and are immutable, meaning their content cannot be changed once created.


**String Pool in Java:**
The String Pool (or String Constant Pool) is a special area in Java's memory that stores unique string objects. When a string is created, Java checks if the same value already exists in the pool. If it does, the reference to the existing object is returned.


**Is String Immutable or Final in Java?**
Strings are immutable in Java, meaning once created, their values cannot be changed. This ensures benefits like security, caching, and synchronization.


**What does the intern() Method Do in Java?**
The intern() method ensures that strings with the same content share the same memory reference by checking if the string is already in the String Pool.

Example:
String str1 = new String("Scaler").intern();
String str2 = new String("Scaler").intern();
System.out.println(str1 == str2);  // true


**Difference between String and StringBuffer:**
String: Immutable, meaning any change results in a new object being created.
StringBuffer: Mutable, allowing in-place modifications without creating new objects.


**Difference between StringBuffer and StringBuilder:**
StringBuffer: Thread-safe but slower due to synchronization.
StringBuilder: Not thread-safe but faster than StringBuffer, making it more efficient for single-threaded applications.


**How to Compare Strings in Java?**
equals(): Compares the actual content.
equalsIgnoreCase(): Compares content ignoring case.
compareTo(): Compares strings lexicographically (returns negative, zero, or positive value).
Example:
String str1 = "Scaler";
String str2 = "Scaler";
System.out.println(str1.equals(str2));  // true
System.out.println(str1.compareTo(str2));  // 0


**How to Declare a String in Java?**
Using String Literal:
String str = "Scaler";
**Using new Keyword**
String str = new String("Scaler");


**Is It Possible to Compare Strings Using the == Operator? What Is the Risk?**
Yes, you can compare strings using the == operator, but this compares references (memory addresses), not values. This can lead to errors if the strings have the same content but different memory locations.


**What is the Use of the substring() Method in Java?**
The substring() method returns a part of a string. It takes two parameters: beginIndex (inclusive) and endIndex (exclusive).

Example:
String str = "Scaler by InterviewBit";
System.out.println(str.substring(7));  // "by InterviewBit"
System.out.println(str.substring(0, 6));  // "Scaler"


**Can We Use a String in a Switch Case in Java?**
Yes, Java allows you to use strings in switch case conditions.

Example:
String fruit = "Apple";
switch (fruit) {
    case "Mango": System.out.println("Sweet"); break;
    case "Apple": System.out.println("Delicious"); break;
    case "Orange": System.out.println("Luscious"); break;
    default: System.out.println("Not a fruit"); break;
}
Output: Delicious
