import java.util.*;
public class bulling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 products prices");
       
        System.out.println("enter the pen price: ");
        float pen = sc.nextFloat();
        System.out.println("enter the book price: ");
        float book = sc.nextFloat();
        System.out.println("enter the notebook price: ");
        float notBook = sc.nextFloat();

        float total = pen + book + notBook;
        System.out.println("the total price is: "+total);

        // add on with 18 % gst 
        float totalGst = (18*total) / 100;
        System.out.println("the gst is: "+totalGst);

    }
}