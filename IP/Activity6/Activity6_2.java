package IP.Activity6;

import java.util.Scanner;

public class Activity6_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();

        int n;
        if (m < 0){
            n = -1;
        }else if(m == 0) {
            n = 0;
        }else{
            n = 1;
        }

        System.out.println("Value of n : " +n);

    }

}
