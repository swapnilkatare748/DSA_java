import java.util.*;
public class factorial {

    public static void main(String[] args){
        System.out.println("Program for calculate the factorial of number : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Hay enter the number : ");
        int n = sc.nextInt();
        int FactorialValue = factorial(n);
        System.out.println("This is factorial of number : "+FactorialValue);
    }   
    
    public static int factorial(int n){
        int f = 1 ;

        for(int i = 1; i <= n;i++){
            f = f * i;
        }
        return f;
    }
}
