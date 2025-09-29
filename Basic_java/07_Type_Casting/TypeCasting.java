import java.util.*;
public class TypeCasting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        float a = sc.nextFloat();
        int b =  (int) a; // this is called explicit type casting
        System.out.println("the number is: "+b);
        sc.close();

    }
}