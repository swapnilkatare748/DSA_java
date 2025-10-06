import java.util.*;

public class average {
    public static void main(String[] afgs){
        System.out.println("\n This is the functions for  : \n Write a Java method to compute the averageof three numbers.");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second 2 number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Theard number 3 :");
        int num3 = sc.nextInt();

        double Average_number = average(num1,num2,num3);

        System.out.println("Average of numbers is : "+Average_number);

    }

    public static double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

}
