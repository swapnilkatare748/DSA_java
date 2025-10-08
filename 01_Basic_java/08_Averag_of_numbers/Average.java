import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("the average of 3 numbers is: "+average);
        sc.close();
    }
}
