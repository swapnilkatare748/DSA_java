import java.util.Scanner;
public class star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of colums:");
        int m = sc.nextInt();

        for(int i = 1 ; i < n ;i++){
            for(int j = 1 ; j < m; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
    }
}