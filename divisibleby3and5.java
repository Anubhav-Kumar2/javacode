package conditional;

import java.util.Scanner;

public class divisibleby3and5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        if (a%3==0 || a%5==0){
            System.out.println("ans found");}
        else{
            System.out.println("ans not fouund");
        }    
        sc.close();
    }

    
}
