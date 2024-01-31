package DSA.Rercursion3;

public class Recursion3_L_PrintKeypadString {
    public static void printKeypad(int input){
        // Write your code here
        printKeypad(input,"");

    }
    public static void printKeypad(int num, String word){
        if(num == 0){
            System.out.println(word);
        }

        String[] currentCharList = getCharList(num%10);
        for(int i = 0; i<currentCharList.length;i++){
            printKeypad(num/10, currentCharList[i]+word);
        }
    }

    private static String[] getCharList(int num){
        switch(num){
            case 2: return new String[] {"a","b","c"};
            case 3: return new String[] {"d","e","f"};
            case 4: return new String[] {"g","h","i"};
            case 5: return new String[] {"j","k","l"};
            case 6: return new String[] {"m","n","o"};
            case 7: return new String[] {"p","q","r","s"};
            case 8: return new String[] {"t","u","v"};
            case 9: return new String[] {"w","x","y","z"};
            default : return new String[] {};
        }
    }
}
