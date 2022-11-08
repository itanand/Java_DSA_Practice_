import java.util.*;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        if(number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
