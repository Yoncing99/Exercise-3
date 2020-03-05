import java.util.Random;
public class Q5{
    public static void main(String[]args){
        String test="abc";
        test = test + test;
        System.out.println(test);

        Random random = new Random();
        double d = Math.round(2.5 + random.nextInt(1));// 1=0
        System.out.println("The value is "+d);
    }
}// abcabc
 // The value is 3.0