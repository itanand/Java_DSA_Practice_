import java.util.*;

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Do a simple Addition here: ");
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
        int diff=b-a;
        System.out.println(diff);
        int ans = a * b / b - a;
        System.out.println(ans);
        int anss = (a * b) / (b  - a);
        System.out.println(anss);

    }
}