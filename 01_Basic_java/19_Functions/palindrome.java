import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int palindrome = sc.nextInt();
         
        if(isPalindrome(palindrome)){
            System.out.println("is palindrom ");

        }else {
            System.out.println("is not palindrom ");
        }

    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10 ;
        }

        if(number == reverse){
            return true;
        }
        return false;
    }
}
