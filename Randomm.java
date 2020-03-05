import java.util.Random;
public class Randomm {
    public static void main(String[] args) {
        Random ra = new Random();
        int num1 = ra.nextInt(100);// random from 0 - 99
        System.out.println("Random Num 1 : " + num1); 
        Random rb = new Random();
        int num2 = rb.nextInt(100);
        System.out.println("Random Num 2 : " + num2); 
        
        System.out.println(Math.max(num1, num2));
    }
}