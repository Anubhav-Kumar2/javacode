package conditional;

import java.util.Scanner;

public class ternary {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        String result;
        result=(a%2==0)?"even":"odd";
        System.out.println(result);
        
        
            sc.close();   
      }
}
    
    
