package test;
public class decimalToBinarary {

    public static void dcimalToBinarary(int decimalNumber){

        int reminder = 0;

        while(decimalNumber > 0 ){
            reminder = decimalNumber % 2 ;   //which gives us reminder

            decimalNumber = decimalNumber /2;   //further reduction in number
            System.out.print(reminder);
        }


    }
    public static void main(String[] args) {
        decimalToBinarary.dcimalToBinarary(239);

    }


    /*
    Here’s the calculation:
any int number if we divide by 2 then we got two things :
1.reminder = 0 or 1 ; ---> base2 which is binary
2.Quotient -->



Division	Quotient	Remainder
229 ÷ 2     	114     	1
114 ÷ 2	         57     	0
57 ÷ 2	         28      	1
28 ÷ 2	         14	        0
14 ÷ 2	          7	        0
7 ÷ 2	          3	        1
3 ÷ 2	          1	        1
1 ÷ 2	          0	        1
     */
}
