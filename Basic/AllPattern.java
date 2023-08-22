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

//        int no =sc.nextInt();
//        int j,k;
//        for(j=1;j<=no;j++){
//            for (k=j;k>=1;k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
        //---------------------- End of 5

        /*  Pattern --------------- 6
                Pattern for N = 4
                A
                BC
                CDE
                DEFG

         */

//        int no =sc.nextInt();
//        int j,k,charNo =65;
//        for(j=1;j<=no;j++){
//            int printChar = charNo;
//            for (k=0;k<j;k++){
//                System.out.print((char)printChar);
//                printChar ++;
//            }
//            System.out.println();
//            charNo++;
//        }

        // ----------------------- End of 6

        /*   Pattern ---------------- 7
                Pattern for N = 5
                E
                DE
                CDE
                BCDE
                ABCDE
         */
//        int no =sc.nextInt();
//        int j,k,charNo =64+no;
//        for(j=1;j<=no;j++){
//            int printChar = charNo;
//            for (k=0;k<j;k++){
//                System.out.print((char)printChar);
//                printChar ++;
//            }
//            System.out.println();
//            charNo--;
//        }
        // ------------------------ End of 7

       /*  Pattern -------------------- 8
        Pattern for N = 4
                   1
                  12
                 123
                1234
        */
//        int no =sc.nextInt();
//        int j,i,space=0;
//        for(j=1;j<=no;j++){
//            for (space=0;space<no-j;space++){
//                System.out.print(" ");
//            }
//            for(i=1;i<=j;i++){
//                System.out.print(i);
//
//            }
//            System.out.println();
//        }
        // ------------------------- End of 8

        /*  Pattern --------------------- 9
            Pattern for no = 4
            55555
            4444
            333
            22
            1

         */

//        int no =sc.nextInt();
//        int j,i,space=0;
//        for(;no>0;no--){
//            for(i=1;i<=no;i++){
//                System.out.print(no);
//
//            }
//            System.out.println();
//        }

        // ----------------------- End of 9
        /*
            Pattern -------------------- 10
            Pattern for n = 4
                   *
                  ***
                 *****
                *******
         */
//        int no =sc.nextInt();
//        int j,i,space;
//        for(j=0;j<no;j++){
//            for (space=0;space<no-j-1;space++){
//                System.out.print(" ");
//            }
//            for(i=1;i<=j*2+1;i++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        // ---------------------------- End of 10

    /*  pattern ---------------------- 11
        Pattern for N = 4
                    1
                   232
                  34543
                 4567654
                567898765
    */
//        int no =sc.nextInt();
//        int j,i,k,space;
//        for(j=0;j<no;j++){
//            for (space=0;space<no-j-1;space++){
//                System.out.print(" ");
//            }
//            for(i=j+1;i<=j*2+1;i++){
//                System.out.print(i);
//            }
//            i = i-2;
//            for(;i>j;i--){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
        // -------------------------------- End of 11

        /*  pattern ---------------------- 12
        Pattern for N = 7
                   *
                  ***
                 *****
                *******
                 *****
                  ***
                   *

         */

//        int no =sc.nextInt();
//        int j,i,space,half = (no/2 + 1);
//        for(j=0;j<half;j++){
//            for (space=0;space<half-j-1;space++){
//                System.out.print(" ");
//            }
//            for(i=1;i<=j*2+1;i++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        for (;j<=no;j++){
//            for (space=j-half;space>=0;space--){
//                System.out.print(" ");
//            }
//            for(i=(no-j-1)*2+1;i>0;i--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        // ------------------------------ End of 12

        /*  pattern --------------------------- 13
            Pattern for n = 6
             *
             *1*
             *121*
             *12321*
             *1234321*
             *123454321*
             *12345654321*
             *123454321*
             *1234321*
             *12321*
             *121*
             *1*
             *
         */
//        int no = sc.nextInt();
//
//        int row,left,right;
//        // to print the first * (it's not s consecutive pattern so just printed it)
//        System.out.println('*');
//        // top part print
//        for(row=1;row<=no;row++){
//
//            // here printing the starting * for every row (*....)
//            System.out.print('*');
//
//            // this for loop to print left side (*123456)
//            for (left=1;left<=row;left++){
//                System.out.print(left);
//            }
//            // this for loop to print right side (4321*)
//            for (right=left-2;right>=1;right--){
//                System.out.print(right);
//            }
//
//            // here printing the ending * for every row and going to next line (*12345654321*)
//            System.out.println('*');
//        }
//        // after completing the top part row will be n/2+2, that's why deducting 2
//        row =row-2;
//
//        // bottom part print
//        for (;row>0;row--){
//
//            // here printing the starting * for every row (*....)
//            System.out.print('*');
//
//            // this for loop to print left side (*123456)
//            for (left=1;left<=row;left++){
//                System.out.print(left);
//            }
//
//            // this for loop to print right side (4321*)
//            for (right=left-2;right>=1;right--){
//                System.out.print(right);
//            }
//
//            // here printing the ending * for every row and going to next line (*12345654321*)
//            System.out.println('*');
//        }
//
//        // to print the last * (it's not s consecutive pattern so just printed it)
//        System.out.print('*');
    // -------------------------------------------------- End of 13

        int no = sc.nextInt();
        int count=0,row;
        String s = "";

        // here we have to print same line every time with space
        // so first creating the string
        for(;count<no;count++){
            s +="*";
        }
        for(row=0;row<no;row++){
            for(count=0;count<row;count++){
                System.out.print(" ");
            }
            System.out.println(s);
        }

    }
}
