import java.util.*;

public class GLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b ){
            System.out.println("Equal");
        }else if(a > b) {
            System.out.println("A is grater than B");
        } else if ( a == 0 && b == 0 ) {
            System.out.println("Bhai Ye Zero hai Equal to bhi hua to kya karega");
        } else {
            System.out.println("A is less than B ");
        }
    }
}
