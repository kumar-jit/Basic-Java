package DSA.Recursion;

import java.util.Scanner;

public class GeometricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findGeometricSum(sc.nextInt()));
    }
    public static double findGeometricSum(int k){
        // Write your code here
        return calculateGeometricSum(k,2);
    }
    public static double calculateGeometricSum(int k, long power){
        if(k<=0){
            return 1.00000;
        }
        double intermediateResult = (1.00000 / power);
        return intermediateResult + calculateGeometricSum(k-1, power * 2);
    }
}
