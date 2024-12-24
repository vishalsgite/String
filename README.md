<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>String in Java - Comprehensive Guide</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f4f4f4;
            color: #333;
        }
        h1, h2 {
            color: #2c3e50;
        }
        pre {
            background-color: #ecf0f1;
            padding: 10px;
            border-radius: 5px;
            font-family: monospace;
            overflow-x: auto;
        }
        code {
            font-family: monospace;
            background-color: #ecf0f1;
            padding: 5px;
        }
        ul {
            list-style-type: disc;
            margin-left: 20px;
        }
        li {
            margin-bottom: 10px;
        }
        .example {
            background-color: #d5f5e3;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #27ae60;
        }
        .output {
            background-color: #f9e79f;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #f39c12;
        }
    </style>
</head>
<body>

    <h1>String in Java - Comprehensive Guide</h1>
    
    <h2>1. What is String in Java?</h2>
    <p>Strings in Java are sequences of characters. For example, the string "Scaler" contains the characters: "S", "c", "a", "l", "e", "r". Strings can be created using String literals or the <code>new</code> keyword. They support various methods such as <code>equals</code>, <code>replace</code>, <code>substring</code>, <code>toUpperCase</code>, <code>split</code>, etc.</p>
    
    <h2>2. Difference between <code>str1 == str2</code> and <code>str1.equals(str2)</code></h2>
    <p>In Java, <code>equals()</code> is a method while <code>==</code> is an operator. The <code>==</code> operator compares references (memory addresses), whereas <code>equals()</code> compares the content of the strings.</p>
    <div class="example">
        <pre>
public class StringComparison {
   public static void main(String[] args) {
       String str1 = new String("Scaler");
       String str2 = new String("Scaler");
       System.out.println(str1 == str2);  // false
       System.out.println(str1.equals(str2)); // true
   }
}
        </pre>
    </div>
    <p><strong>Output:</strong></p>
    <div class="output">
        false <br>
        true
    </div>

    <h2>3. Is String a Primitive or Derived Type in Java?</h2>
    <p>Strings are derived data types. They are objects created using the <code>java.lang.String</code> class, unlike primitive types which do not support methods like <code>substring()</code> or <code>toUpperCase()</code>.</p>

    <h2>4. Difference between String in C and String in Java</h2>
    <ul>
        <li><strong>C:</strong> Strings are arrays of characters, null-terminated (with a <code>/0</code>).</li>
        <li><strong>Java:</strong> Strings are objects created using the <code>java.lang.String</code> class and are immutable.</li>
    </ul>

    <h2>5. String Pool in Java</h2>
    <p>The String pool (or String Constant Pool) is a memory space that stores unique string values. When you create a string, it checks if the value is already in the pool. If it is, the reference to the existing object is returned; otherwise, the string is added to the pool.</p>

    <h2>6. Is String Immutable or Final in Java?</h2>
    <p>Strings in Java are immutable, meaning their values cannot be changed once created. However, you can change the reference to a new string. This immutability provides benefits like security, caching, and better handling in concurrent environments.</p>

    <h2>7. The <code>intern()</code> Method in Java</h2>
    <p>The <code>intern()</code> method ensures that strings with the same content share the same memory. If a string is interned, it is checked in the String pool; if already present, the reference is returned.</p>
    <div class="example">
        <pre>
String str1 = new String("Scaler").intern();
String str2 = new String("Scaler").intern();
System.out.println(str1 == str2);  // true
        </pre>
    </div>
    <p><strong>Output:</strong></p>
    <div class="output">
        true
    </div>

    <h2>8. String vs StringBuffer in Java</h2>
    <ul>
        <li><strong>String:</strong> Immutable, creating a new object for each modification, which can be inefficient.</li>
        <li><strong>StringBuffer:</strong> Mutable, faster for string manipulation as it can be modified without creating new objects.</li>
    </ul>

    <h2>9. StringBuffer vs StringBuilder in Java</h2>
    <ul>
        <li><strong>StringBuffer:</strong> Synchronized and thread-safe but slower.</li>
        <li><strong>StringBuilder:</strong> Not synchronized, thus faster but not thread-safe.</li>
    </ul>

    <h2>10. Comparing Strings in Java</h2>
    <ul>
        <li><strong>equals()</strong>: Compares the values of two strings.</li>
        <li><strong>compareTo()</strong>: Compares strings lexicographically.</li>
        <li><strong>equalsIgnoreCase()</strong>: Compares two strings ignoring case.</li>
    </ul>

    <h2>11. Declaring a String in Java</h2>
    <p>Strings can be declared in two ways:</p>
    <ul>
        <li>Using a string literal: <code>String str = "Scaler";</code></li>
        <li>Using the <code>new</code> keyword: <code>String str = new String("Scaler");</code></li>
    </ul>

    <h2>12. Using Strings in a Switch Case</h2>
    <p>Java allows using strings in <code>switch</code> cases. Below is an example:</p>
    <div class="example">
        <pre>
public class StringinSwitchCase {
   public static void main(String[] args) {
       String fruit = "Apple";
       switch(fruit) {
           case "Mango": System.out.println("Sweet"); break;
           case "Apple": System.out.println("Delicious"); break;
           default: System.out.println("Unknown");
       }
   }
}
        </pre>
    </div>
    <p><strong>Output:</strong></p>
    <div class="output">
        Delicious
    </div>

</body>
</html>
