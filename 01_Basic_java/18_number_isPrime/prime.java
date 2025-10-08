import java.util.*;
public class prime {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // isPrime(num);
        System.out.println("number is : "+isPrime(num));
    }

    public static boolean isPrime(int n){
        if(n==2){
           return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
