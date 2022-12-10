abstract class Base{

    void fun(){
        {
            // Print statement
            System.out.println("Base Constructor Called");
        }
    };
}

class Derived extends Base{
    // Derived()
    // {
    //     System.out.println("Derived Constructor is Called");
    // }
    // public void fun(){
    //     System.out.println("Derived Fun() Calling");
    // }
}
public class No {
    public static void main(String args[]){
          Derived b = new Derived();
          b.fun();
    }
}
