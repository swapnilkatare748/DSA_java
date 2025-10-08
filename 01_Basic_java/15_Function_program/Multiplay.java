import java.util.*;

public class Multiplay{
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("This progrm is use to define the function and do multification of 2 numbers");
        System.out.println(" Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int result = Multipleaction(num1,num2);

        System.out.println("This is the product of num1 : " + num1 + " and num2 :  "+num2 + " = " + result);        

    }
    public static int Multipleaction(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
};