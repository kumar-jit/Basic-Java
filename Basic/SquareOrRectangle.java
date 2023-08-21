package Basic;
import java.util.Scanner;
public class SquareOrRectangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a==b) System.out.print("Square");
        else System.out.print("Rectangle");
    }

}
