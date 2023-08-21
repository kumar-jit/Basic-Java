package Basic;
import java.util.Scanner;
public class DecisionMaking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(compareIfElse(a,b));
    }
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a>b) return "greater" ;
        else if(a==b) return "equal";
        else return "smaller";
    }


}
