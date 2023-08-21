package Basic;
import java.util.Scanner;
public class MultipleOf5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();
        if(No>0 && No%5 == 0) System.out.print("Multiple of 5");
        else System.out.print("Not a Multiple of 5");
    }
}
