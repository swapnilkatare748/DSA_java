import java.util.scanner;
public class revorce{
    public static void main(String args[]){
        scanner sc = new scanner(System.in);
        int n = sc.nextInt();
        
        while(n>0){
            int last_digit = n % 10;
            rev = (rev*10)+last_digit; 
            system.out.print(last_digit);
            n = n/10;
        }
        system.out.println("rev : "+rev);
    }
}