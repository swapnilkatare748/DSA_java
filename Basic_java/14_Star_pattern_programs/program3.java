import java.util.Scanner;

public class program3{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("\nEnter the number of lines :");
         int n = sc.nextInt();
         for(int i = 1; i <= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
            
         }
    }
}