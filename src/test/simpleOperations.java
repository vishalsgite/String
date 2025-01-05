package test;

public class simpleOperations {

    public static void main(String[] args) {

      //  simpleOperations.findOddOrEven(547 );
     //   simpleOperations.reverseNumber(7845);
     //   simpleOperations.findPow(2,3);
      //  simpleOperations.countDigit(448);
       // simpleOperations.armstrongNumber(153);
      //  simpleOperations.palindromeNumber(1211);
      //     simpleOperations.divisorsOfNumber(36);
        simpleOperations.primeOrNot(6);


    }

    private static void primeOrNot(int number) {

        int counter = 2;

        int squareRoot = (int)Math.sqrt(number);

        while(counter <= squareRoot){
            if(number % counter == 0){
                System.out.println(number +" NOT PRIME");
                return;
            }
            counter++;
        }
        System.out.println(number+" IS PRIME NUMBER");
    }

    private static void divisorsOfNumber(int number) {

        int counter = 1;
        int squareRoot = (int)Math.sqrt(number);

        while (counter <= squareRoot){

            if(number % counter == 0 ) {
                System.out.println(counter + " is a divisor of " + number);

             // Avoid duplicate printing when counter == otherNumber
                int otherNumber = number / counter;
                if (otherNumber != counter) { // Avoid duplicate for perfect squares
                    System.out.println(otherNumber + " is a divisor of  " + number);
                }
            }
            counter++;
        }
    }


    private static void palindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = simpleOperations.reverseNumber(number);

        if(originalNumber == reversedNumber ){
            System.out.println("Number is palindrome ");
        }else
        System.out.println("Not palindrome");

    }

    private static void armstrongNumber(int number) {

        int result = 0;
        int originalNumber = number;

        while (number > 0){
           int unitDigit=  number % 10 ;
           result = result + simpleOperations.findPow(unitDigit,3);
           number = number / 10;
        }
        if(result == originalNumber){
            System.out.println("Number Is Armstrong ");
        }else {
            System.out.println("Number Is Not Armstrong ");
        }
    }

    private static void countDigit(int number) {
        int counter = 0;

        if(number == 0){
            System.out.println("1");
        }
        while (number > 0){
            number = number / 10;
            counter++;
        }
        System.out.println(counter);

    }

    public static int findPow(int num, int power) {

        double result = 1;
        for(int i=0; i < power;i++){
            result = result * num;
        }
        System.out.println(result);
        return (int) result;
    }

    public static int  reverseNumber(int number) {

        int reversed = 0; // Store the reversed number

        while (number > 0) {
            int unitDigit = number % 10; // Extract the last digit
            reversed = reversed * 10 + unitDigit; // Add the digit to reversed number
            number /= 10; // Remove the last digit

        }
        System.out.println(reversed);
        return reversed;
    }

    public static void findOddOrEven(int number) {

        if(number % 2 == 0){   //if true :  unit digit is even then we simply says number is even else odd
            System.out.println("Number is Even");
        }else{
            System.out.println("Number Is Odd");
        }

    }
}
