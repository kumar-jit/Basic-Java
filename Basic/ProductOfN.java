package Basic;
import java.util.Scanner;
public class ProductOfN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long product = 1;
        //Write your code here
        while(n>0){
            product = product * n;
            n = n-1;
        }
        System.out.print(product);
    }

}
