import bank.Bank;


class Shape{
   public void area() {
    System.out.println("Area Calculated");
   }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String args[]){
        Triangle tri = new Triangle();

        tri.area(6,3);

        Circle c = new Circle();

        c.area(5);


        Bank.Account acc = new Bank.Account();

        acc.name="Anand";

        System.out.println(acc.name);



    }
}
