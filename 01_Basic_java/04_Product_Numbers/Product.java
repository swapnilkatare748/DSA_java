import java.util.*;

public class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second Number:");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("the product of two numbers is: "+product);
        sc.close();

    }
}