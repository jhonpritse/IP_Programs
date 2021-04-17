package IP.EggCostCalculator;


import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
//input system
        Scanner input = new Scanner(System.in);
        System.out.printf("" +
               "***************************%n" +
               "Enter number of eggs: ");
//try catch for error checking input value
        int numEggs = 0;
        boolean isdone;
        do {
            try {
                numEggs = input.nextInt();
                isdone = true;
            }catch ( Exception e){
                System.out.printf("" +
                        "***************************" +
                        "%nSomething went wrong! " +
                        "%nPlease input a valid number of eggs%n" +
                        "***************************" +
                        "%nEnter number of eggs: ");
                        input.next();
                        isdone = false;
            }
        }while(!isdone);
        System.out.printf("" +
               "***************************%n" +
               "%nYou ordered %d eggs", numEggs);
//variables used
        int numDozen = numEggs/12;
        int numDozenRemainder = numEggs%12;
//checks if eggs ordered are at least a dozen
        if (numDozen >= 1){
//sorts the eggs in dozens
            System.out.printf("%n%nThat's %d dozen at 3.25$ per dozen", numDozen);
//sorts the remainder of the eggs left over from the dozens
            if(numDozenRemainder != 0 ){
                if(numDozenRemainder == 1 )
                    System.out.printf("%nAnd %d individual egg at 45 cents",numDozenRemainder);
                else
                    System.out.printf("%nAnd %d individual eggs at 45 cents each",numDozenRemainder);
            }
//checks eggs ordered are less than a dozen
        }else {
            if(numDozenRemainder == 1)
                System.out.printf("%n%nThat's %d egg at 45 cents", numDozenRemainder);
            else
                System.out.printf("%n%nThat's %d eggs at 45 cents each", numDozenRemainder);
        }
//net total of the order
        float netTotal = (numDozen * 3.25f) + (numDozenRemainder * 0.45f);
        System.out.printf("%nFor a total of %,.2f$ %n" +
                "%n***************************%n", netTotal);
    }
}
