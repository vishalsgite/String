package test;



public class JavaNumberProblems {

    public static void generateFibonacciSeries(int maxNumber){
        int first = 0 ;
        int second = 1;
        System.out.print(first);

        if(maxNumber > 0 ){
            System.out.print(","+second);
        }
        int next;
        // Generate and print the series until the next number exceeds maxNumber
        while(true){
            next = first + second;
            if(next > maxNumber){
                break;
            }
            System.out.print(","+next);
            first = second;
            second = next ;
        }
    }
public static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }
    // Check divisibility from 2 to sqrt(number)

    for(int i=2;i<=number/2; i++){
        if(number % i == 0){
            return false;    // Number is divisible, not prime
        }
    }
    return true;   // Number is prime
}


    public static long findFactorial(int number) {
        long result = 1;

        // Calculate factorial iteratively
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number, sum = 0, digits = 0;

        // Count digits
        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Compute the sum of the powers of digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNumber;
    }
    public static void main(String[] args) {
      //  generateFibonacciSeries(10);
       // System.out.println(isPrime(4));
        System.out.println(findFactorial(5));
    }
}
