package IP.Activty5.MinutesHourDayConverter;

import java.util.Scanner;

public class MinutesConverter {

    public static void main(String[] args) {
//Input system
        Scanner input = new Scanner(System.in);
        System.out.printf("" +
                "***************************%n" +
                "Enter number of minutes: ");
//Variables for error checking
        float minutes = 0;
        boolean isDone;
        do {
            try {
                minutes = input.nextFloat();
                isDone = true;
            }catch ( Exception e){
                System.out.printf("" +
                        "***************************" +
                        "%nSomething went wrong! " +
                        "%nPlease input a valid number of minutes%n" +
                        "***************************" +
                        "%nEnter number of minutes: ");
                input.next();
                isDone = false;
            }
        }while(!isDone);
//Conversion
        float hours = minutes/60f;
        float days = hours/24f;

//Prints out output
        System.out.printf("***************************%n");
//decimal logic
        if (minutes%1 == 0)
            System.out.print((int)minutes + " minutes equals ");
        else
            System.out.printf("%,.3f minutes equals ",minutes);
        if(minutes%60 == 0)
            System.out.print((int)hours+ " hours and equals ");
        else
            System.out.printf("%,.3f  hours and equals ",hours);
        if(hours%24 == 0)
            System.out.print((int)days + " days" +
                    "\n***************************\n");
        else
            System.out.printf("%,.3f days" +
                    "%n***************************%n",days);
    }
}
