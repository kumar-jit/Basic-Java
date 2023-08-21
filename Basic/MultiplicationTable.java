package Basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 0;
        while ((count=count+1)<=10){
            System.out.println(no*count);
        }
    }
}
