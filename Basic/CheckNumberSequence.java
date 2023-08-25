package Basic;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean decSeq = true,status = true;
        int noOfSeq =sc.nextInt();
        int previousNo=0,currentNo;
        while (noOfSeq>=1){
            noOfSeq--;
            currentNo = sc.nextInt();       // taking input form user

            // this if to check is previous is initialized or not
            if(previousNo ==0){
                // user only provide one value so making the current value to previous so comparison can be done in future
                previousNo = currentNo; // providing previous value
                continue;
            }

            // checking is input getting increased or not
            if(currentNo!=previousNo && status){

                // if input getting increased that means user cant decrease anymore
                if(previousNo<currentNo && decSeq){
                    // making decrease  flag false so next time decrease can be possible
                    decSeq = false;
                    previousNo = currentNo;
                    continue;
                }
                if(previousNo>currentNo && !decSeq){
                    status = false;
                }

            }
            else {
                status = false;
            }
//            if(decSeq && status &&  )
            previousNo = currentNo;
        }
        System.out.print(status);
    }
}
