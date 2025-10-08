import java.util.Scanner;

public class Rhombos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int num = sc.nextInt();
        solid_rohmbos(num);

    }
    public static void solid_rohmbos(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=n; j++){
                 System.out.print("*");
            }

            System.out.println();
        }

    }
}
