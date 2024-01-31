package DSA.Rercursion3;

public class Recursion3_A_ReturnPermutationOfAString {
    public static String[] permutationOfString(String word){
        if(word.length() == 1){
            String[] ans  = new String[1];
            ans[0] = word;
            return ans;
        }
        int arrLength = permutation(word.length());
        String[] currentList = new String[arrLength];
        int count = 0;
        for(int i = 0;i<word.length();i++){
            String leftString = word.substring(0,i) + word.substring(i+1,word.length());
            String[] smallCase = permutationOfString(leftString);
            for(int j = 0; j < smallCase.length; j++){
                currentList[count++] = word.substring(i,i+1) +  smallCase[j];
            }
        }
        return currentList;
    }

    public static int permutation(int num){
        if(num == 1){
            return 1;
        }
        return (num * permutation(num-1));
    }
}
