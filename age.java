package conditional;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        if(age<12){
            System.out.println("child");
        }
        else if(age>12 && age<18){
            System.out.println("teenager");
        }
        else if(age>18)
        {
            System.out.println("adult");
        }
        sc.close();  

    }
    
}
