package IP.Activity7;

import java.util.Scanner;

public class Activity7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String X;
        System.out.print("Enter Letter :");
        X = input.next();
        switch (Character.toUpperCase(X.charAt(0))) {
            case 'A', 'E', 'I', 'O', 'U' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
