package Basic;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
    public static void main(String[] args) {
        //Write your code here.
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        char grade = sc.next().charAt(0);
        double hra = base * (20.0/100.0);
        double da = base * (50.0/100.0);
        double pf = base * (11.0/100.0);

        if(grade == 'A') System.out.print(Math.round(base + hra + da - pf + 1700));
        else if(grade == 'B') System.out.print(Math.round(base + hra + da - pf + 1500));
        else System.out.print(Math.round(base + hra + da - pf + 1300));
    }
}
