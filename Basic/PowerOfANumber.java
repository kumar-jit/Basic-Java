package Basic;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int x = sc.nextInt();
        int power = 1;
        while((x=x-1)>=0){
            power = power * no;
        }
        System.out.print(power);
        // Write your code here

    }
}
