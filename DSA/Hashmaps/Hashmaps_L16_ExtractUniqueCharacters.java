package DSA.Hashmaps;
/*
 Extract Unique characters
    Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.

    Detailed explanation ( Input/output format, Notes, Images )
    Constraints :
    0 <= Length of S <= 10^8
    Time Limit: 1 sec
    Sample Input 1 :
    ababacd
    Sample Output 1 :
    abcd
    Sample Input 2 :
    abcde
    Sample Output 2 :
    abcde
 */
import java.util.HashMap;

public class Hashmaps_L16_ExtractUniqueCharacters {
    public static String uniqueChar(String str){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        HashMap<Character,Integer> charStore = new HashMap<>();
        String ans = "";
        for(int i = 0; i<str.length();i++){
            Character c = str.charAt(i);
            charStore.put(c, charStore.getOrDefault(c, 0)+1);
            if(charStore.get(c)==1){
                ans += c;
            }
        }

        return ans;

    }
}
