import java.util.*;

public class Overloading {
       public static void main(String[] args){
        System.out.println("Sum of two numbers : "+sum(4,6));
        System.out.println("Sum of two numbers : "+sum(4,6,7));
    }
    public static int sum(int i,int j){
        return i + j;
    }
    public static int sum(int i , int j , int k){
         return  i + j + k;
    }
}
