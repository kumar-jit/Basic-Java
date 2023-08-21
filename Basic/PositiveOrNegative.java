package Basic;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();
        if(No>=0) System.out.print("Positive");
        else System.out.print("Negative");
    }
}
