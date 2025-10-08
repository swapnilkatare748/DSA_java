import java.util.Scanner;

public class floyds {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         floyds_trangle(num);
    }

    public static void floyds_trangle(int n){
        int conuter = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=i; j++){

                System.out.print(conuter+" ");
                conuter++;
            }
            System.out.println();

        }

    }
    
  
}
