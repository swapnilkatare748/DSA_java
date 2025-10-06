import java.util.*;

public class iseven {
    public static void main(String[] argc){
        System.out.println("\n Enter the number : "); 
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         if(isEven(num)){
            System.out.println("Number is even ");

         }else{
            System.out.println("Number is not enve");
         }
    }

    public static boolean isEven(int num){

        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
