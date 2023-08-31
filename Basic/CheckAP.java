package Basic;

import java.util.Scanner;

public class CheckAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean status = true,previousNoFlag=false;
        if(no==0){
            System.out.print(false);
        }
        int previousNo=0,currentNo =sc.nextInt(),mainDiff=0;
        for(int i=1;i<no;i++){
            previousNo = currentNo;
            currentNo = sc.nextInt();
            if(i==1){
                mainDiff = currentNo-previousNo;
                continue;
            }

            if(status && (currentNo-previousNo)!=mainDiff){
                status = false;
            }
        }
        System.out.print(status);
    }
}
