package Basic;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int choice = sc.nextInt();
        if(choice == 1){
            int sum = 0;
            while (no>0){
                sum = sum + no;
                no--;
            }
            System.out.print(sum);
        }
        else if (choice == 2){
            int product = 1;
            while (no>0){
                product = product * no;
                no--;
            }
            System.out.print(product);
        }
        else System.out.print(-1);
    }
}
