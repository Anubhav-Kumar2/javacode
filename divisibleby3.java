import java.util.Scanner;

public class divisibleby3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a:");
    int a=sc.nextInt();
    String result;
    result=(a%2==0 && a%3==0) ? "ans found":"ans not found";
    System.out.println(result);
    sc.close();
    }
}
