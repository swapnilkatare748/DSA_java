import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int marks[] = new int[100];
        
        marks[0]= sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("mark 1 : "+marks[0]);
        System.out.println("Mark 2 :"+marks[1]);
        System.out.println("Marks 3 : "+marks[2]);

        // update tha array element 

        marks[0] = marks[2]+1;
        System.out.println("updated mark 1 : "+marks[0]);

    }
}