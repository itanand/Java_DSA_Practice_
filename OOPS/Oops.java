class Pen{
  String color;
  String type;

  public void Write() {
    System.out.println("Writing Here");
  }

  public void printColor() {
    System.out.println(this.color);
 }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class Oops{
    public static void main(String args[]){
         Student s1 = new Student();
         s1.name="Anand";
         s1.age=21;

         Student s2 = new Student();
         s2.name="Anand";


    }
}