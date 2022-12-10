import java.util.*;

public class AddNumbers{

    //created a method
    public int addNumber(int a, int b){
         int sum = a + b;
         return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        AddNumbers obj = new AddNumbers();

        int result = obj.addNumber(num1, num2);

        System.out.println("Sum is " + result);
    }
}