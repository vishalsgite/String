package test;

public class BinararyToDecimal {

    public static void BinararyToDecimal(int binarary){

        int power = 0;

        int result = 0;

        while (binarary > 0){
            int unitDigit = binarary % 10 ;  //find unit digit
            unitDigit = unitDigit * (int)Math.pow(2, power);

            binarary =  binarary / 10 ;
            result = result + unitDigit;
            power++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        BinararyToDecimal.BinararyToDecimal(11101111);
    }
}
