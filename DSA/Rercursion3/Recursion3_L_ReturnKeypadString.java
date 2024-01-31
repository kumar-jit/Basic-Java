package DSA.Rercursion3;

public class Recursion3_L_ReturnKeypadString {
    public static String[] keypad(int n){
        if(n < 10){
            return getCharList(n);
        }

        String[] oldString = keypad(n/10);
        String[] charList = getCharList(n%10);
        int length = oldString.length*charList.length;
        int count = 0;
        String[] newString = new String[length];
        for(int i = 0; i< oldString.length; i++){
            for(int j = 0; j< charList.length;j++){
                newString[count++] = oldString[i] + charList[j];
            }
        }

        return newString;

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
