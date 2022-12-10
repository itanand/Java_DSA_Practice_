public class ADDD{
    public static void main(String args[]){
         void ADDDD() {
            int i = 0;
            int sum = 0;
            while(i < 100){
                sum = sum + i;
                sum = i + sum;
                i += 1;
            }
            System.out.println(sum);
        }
    }
}