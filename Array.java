import java.util.*;

public class Array {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);

         int size = sc.nextInt();

         int numbers[] = new int[size];
        // int marks[] = new int[3];
        //     marks[0] = 97; // phy
        //     marks[1] = 98; // chy
        //     marks[2] = 92; //eng

        //     int n = marks.length;

        for( int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

            for(int i=0; i<size; i++){
                System.out.println("You Got " + numbers[i] );
            }

            int x = sc.nextInt();

            for(int i = 0; i<numbers.length; i++){
                if(numbers[i] == x){
                    System.out.println(x + " Found at Position " +i);
                }
            }
    }
}
