package IP.Activity6;

import java.util.Scanner;

public class Activity6_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        if (X < 0){
            System.out.println(X + " is a negative number");
        }else {
            System.out.println(X + " is a positive number");
        }

    }

}
