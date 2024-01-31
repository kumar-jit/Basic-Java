package DSA.Rercursion3;

public class Recursion3_A_PrintPermutationOfString {
    public static void permutations(String input){
        // Write your code here
        printPermutations(input,"");
    }

    public static void printPermutations(String input,String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        int length = output.length();
        char currentChar = input.charAt(0);
        for(int i=0; i<=length; i++){
            String newString = output.substring(0,i) + currentChar + output.substring(i,length);
            printPermutations(input.substring(1),newString);
        }
    }
}
