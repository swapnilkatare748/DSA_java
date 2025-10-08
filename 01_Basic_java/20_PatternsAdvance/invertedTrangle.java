import java.util.*;

public class invertedTrangle {
    
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    invertedTrangleStructure(num);

 }

 public static void invertedTrangleStructure(int n ){

    for (int i = 1; i<=n;i++){
        for(int j = 1; j <= n-1 ; j++ ){
            System.out.print(" ");
        }
        for(int j = 1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
 }

}
