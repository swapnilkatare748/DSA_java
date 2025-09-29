import java.util.*;

public class Area{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        float r = sc.nextInt();
        float area = 3.24f*r*r;
        System.out.println("the area of circle is: "+area);
        sc.close();       
    }
    
}
