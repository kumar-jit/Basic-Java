/**
 * @link : https://classroom.codingninjas.com/app/classroom/me/24108/content/586729/offering/9098100/problem/2943
 * @title : Total Sum on the Boundaries and Diagonals
 */

package Array.Array2D;

import java.util.Scanner;

public class TotalSumBoundariesDiagonals {

    public static Scanner sc = new Scanner(System.in);

    public static int[][] take2DArrayInput() {
        int row = sc.nextInt();
        int[][] arr = new int[row][row];
        for (int i =0;i<row;i++) {
            for(int j = 0; j< row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int repeat = sc.nextInt();
        for(int i = 0; i<repeat; i++) {
            TotalSumBoundariesAndDiagonals(take2DArrayInput());
        }
    }
    public static void TotalSumBoundariesAndDiagonals(int[][] arr){
        int total = 0;
        int l = arr.length;
        for(int i = 0;i<l;i++){
            total += arr[0][i] + arr[l-1][i];
//            System.out.print(arr[0][i] + " " + arr[l-1][i] + " ");
            if(i>0 && i<l-1){
                total += arr[i][0] + arr[i][l-1] + arr[i][i];
//                System.out.print(arr[i][0] +" "+ arr[i][l-1] +" "+ arr[i][i]);
                if(i!=l-1-i){
                    total +=arr[i][l-1-i];
                }
            }
//            System.out.println(" = " + total);
        }
        System.out.println(total);
    }
}
