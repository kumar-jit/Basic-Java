package Basic;

import java.util.Scanner;

public class TypeOfTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        //Write your code here

        if(x==y && y==z) System.out.print("Equilateral Triangle");
        else if (x!=y && y!=z) System.out.print("Scalene Triangle");
        else System.out.print("Isosceles Triangle");
    }
}
