package DSA.Rercursion3;

import java.util.Scanner;

public class mainFunction {

    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
//        _Recursion3_L_ReturnKeypadString();
//        _Recursion3_L_PrintKeypadString();
//        _Recursion3_A_ReturnSubsetsSumToK();
//        _Recursion3_A_ReturnSubsetsOfAnArray();
//        _Recursion3_A_ReturnPermutationOfAString();
//        _Recursion3_A_PrintPermutationOfString();\
//        _Recursion3_A_PrintSubsetSumToK();
        _Recursion3_A_GetUniqueSubset();
    }

    public static void _Recursion3_L_PrintKeypadString() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Recursion3_L_PrintKeypadString.printKeypad(input);
    }

    public static void _Recursion3_L_ReturnKeypadString() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = Recursion3_L_ReturnKeypadString.keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }



    public static void _Recursion3_A_ReturnSubsetsSumToK() {
        int[] input = takeInput();
        int k = s.nextInt();
        int output[][] = Recursion3_A_ReturnSubsetsSumToK.subsetsSumK(input, k);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void _Recursion3_A_ReturnSubsetsOfAnArray() {
        int[] input = takeInput();
        int output[][] = Recursion3_A_ReturnSubsetsOfAnArray.subsets(input);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void _Recursion3_A_ReturnPermutationOfAString() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String output[] = Recursion3_A_ReturnPermutationOfAString.permutationOfString(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static void _Recursion3_A_PrintPermutationOfString() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Recursion3_A_PrintPermutationOfString.permutations(input);
    }

    public static void _Recursion3_A_PrintSubsetSumToK() {
        int[] input = takeInput();
        int k = s.nextInt();
        Recursion3_A_PrintSubsetSumToK.printSubsetsSumTok(input, k);
    }

    public static void _Recursion3_A_GetUniqueSubset() {
        int[] input = takeInput();
        Recursion3_A_GetUniqueSubset.printSubsets(input);
    }

}
