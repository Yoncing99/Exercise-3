import java.util.Scanner;
public class Q6{
    public static void main(String[]args){
        //a
        Scanner sc=new Scanner(System.in);
        //b
        System.out.println("Enter integer 1:");
        int x = sc.nextInt();
        System.out.println("Enter integer 2:");
        int y = sc.nextInt();

        //c
        System.out.println("Product is "+Math.pow(x,y));

    }
}