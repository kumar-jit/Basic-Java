package DSA.DP1;

public class DP1_L_MinStepsToOneUsingDP {
    static int[] DP;
    public static int countMinStepsToOne(int n) {
        //Your code goes here
        DP = new int[n+1];
        // return countMinStepsToOneDPRecursive(n);
        return countMinStepsToOneDPItaretive(n);
    }

    public static int countMinStepsToOneDPRecursive(int n){
        if(n == 1){
            return 0;
        }
        int	minStpes = Integer.MAX_VALUE;

        if(DP[n-1] == 0){
            DP[n-1] = countMinStepsToOneDPRecursive(n-1);
        }
        minStpes = Math.min(DP[n-1], minStpes);

        if(n%2 == 0){
            if(DP[n/2] == 0){
                DP[n/2] = countMinStepsToOneDPRecursive(n/2);
            }
            minStpes = Math.min(DP[n/2], minStpes);
        }

        if(n%3 == 0){
            if(DP[n/3] == 0){
                DP[n/3] = countMinStepsToOneDPRecursive(n/3);
            }
            minStpes = Math.min(DP[n/3], minStpes);
        }
        return (minStpes + 1);
    }
    public static int countMinStepsToOneDPItaretive(int n){
        if(n == 1){
            return 0;
        }
        DP[1] = 0;

        for(int i = 2; i< n+1; i++){
            int	minStpes = Integer.MAX_VALUE;

            minStpes = Math.min(DP[i-1], minStpes);

            if(i%2 == 0){
                minStpes = Math.min(DP[i/2], minStpes);
            }

            if(i%3 == 0){
                minStpes = Math.min(DP[i/3], minStpes);
            }
            DP[i] = minStpes + 1;
        }
        return DP[n];
    }
}
