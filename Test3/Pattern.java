/*

     Rectangular numbers
        Print the following pattern for the given number of rows.
        Pattern for N = 4
        4444444
        4333334
        4322234
        4321234
        4322234
        4333334
        4444444
        Input format : N (Total no. of rows)
        Output format : Pattern in N lines
        Sample Input :
        3
        Sample Output :
        33333
        32223
        32123
        32223
        33333






//-------- Solution explanation ---------------------
    If we observer carefully in the center we have 1, the sounding 1 we have 2, then go on.
    If we remember in Matrix spiral printing we do the same. first print outer line then inner line then so on.
    here instead of printing we put element on that position the print the matrix
 */

package Test3;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n*2-1][n*2-1];
        makePattern(arr,n);
        printPattern(arr);
    }
    public static void makePattern(int[][] arr,int n){
        int totalValue = arr.length*arr[0].length;
        int rs = 0, re = arr.length-1, cs = 0, ce = arr[0].length-1;

        while(totalValue>0){
            for(int i = cs;i<=ce && totalValue>0;i++){
                arr[rs][i] = n;
                --totalValue;
            }
            ++rs;

            for(int i = rs; i<=re && totalValue>0;i++){
                arr[i][ce] = n;
                --totalValue;
            }
            --ce;

            for(int i= ce;i>=cs && totalValue>0;i-- ){
                arr[re][i] = n;
                --totalValue;
            }
            --re;

            for(int i=re;i>=rs && totalValue>0;i--){
                arr[i][cs] = n;
                --totalValue;
            }
            cs++;
            n--;
        }
    }
    public static void printPattern(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }
}
