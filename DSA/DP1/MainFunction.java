package DSA.DP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFunction {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, NumberFormatException{
        _DP1_L_MinStepsToOneUsingDP();
    }


    public static void _DP1_L_MinStepsToOneUsingDP() throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(DP1_L_MinStepsToOneUsingDP.countMinStepsToOne(n));
    }
}
