package Basic;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Fibonacci(sc.nextInt()));
    }
    static int Fibonacci(int no){
        if(no==0){
            return 0;
        }
        else if(no==1 || no==2){
            return 1;
        }
        else return Fibonacci(no-1)+ Fibonacci(no-2);
    }
}
