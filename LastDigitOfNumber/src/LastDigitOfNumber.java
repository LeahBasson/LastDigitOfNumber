
import java.util.Scanner;


public class LastDigitOfNumber {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//      Modulus is used to find the remainder. When you divide a number by 10. The remainder is the last digit.
        int num,lastDigit;
        
        System.out.println("Enter number: ");
        num = scn.nextInt();
        lastDigit = num % 10;
        
        System.out.println("Last digit of number: " + lastDigit);
    }
    
}
