// Quation : Write a program to calculate the area of a square.

import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square: ");
        int a = sc.nextInt();
        int area = a*a;
        System.out.println("the area of Squar is : "+area);
        sc.close();
    }
}