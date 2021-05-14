package IP.Activity6;

import java.util.Scanner;

public class Activity6_4_AgeToVote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age > 18){
            System.out.println("Right to vote!");
        }else {
            System.out.println("Too young!");
        }

    }

}