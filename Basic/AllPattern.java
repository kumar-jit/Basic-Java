package Basic;

import java.util.Scanner;

public class AllPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  Pattern ---------------- 1
                Pattern for N = 4
                4444
                4444
                4444
                4444
        */
        //Coding for this pattern

//        int no = sc.nextInt();
//        int count = 0;
//        String s ="";
//        while((count+=1)<=no){
//            s +=Integer.toString(no);
//        }
//        count = 0;
//        while((count+=1)<=no){
//            System.out.println(s);
//        }

        //--------------------------End Of 1 --


        /*  Pattern ------------------- 2
            Pattern for N = 5
            11111
            22222
            33333
            44444
            55555
        */

//        int no =sc.nextInt();
//        int j,k;
//        for(j=1;j<=no;j++){
//            for (k=0;k<no;k++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //--------------------------End Of 2 --

        /*  Pattern ----------------    3
            Pattern for N = 4
                    *
                    **
                    ***
                    ****

         */

//        int no =sc.nextInt();
//        int j,k;
//        for(j=1;j<=no;j++){
//            for (k=0;k<j;k++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        //---------------------- End of 3

        /*  Pattern ----------------------- 4
            Pattern for N = 4
            1
            22
            333
            4444

         */
//        int no =sc.nextInt();
//        int j,k;
//        for(j=1;j<=no;j++){
//            for (k=0;k<j;k++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // --------------------------- End of 4

        /*  Pattern ----------------    5
                Pattern for N = 4
                1
                21
                321
                4321

         */

        int no =sc.nextInt();
        int j,k;
        for(j=1;j<=no;j++){
            for (k=j;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        //---------------------- End of 5


    }
}
