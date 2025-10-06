import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum is : "+sumOfDigits(digits));

    }

    public static int sumOfDigits(int n){
        int sumDigits = 0;
        while (n>0) {
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n /= 10; 
            
        }
        return sumDigits;
    }

}
