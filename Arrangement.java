import java.util.Scanner;

public class Arrangement
{
    public static void main(String[]args)
    {
        int enter1,enter2,enter3,choice;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        enter1 = keyboard.nextInt();
        enter2 = keyboard.nextInt();
        enter3 = keyboard.nextInt();
        System.out.println("Your numbers are: "+ enter1 +"-"+ enter2+"-"+ enter3);

        System.out.println("How do you want to sort of numbers?\n1-Small to Large\n2-Large to Small\nPRESS 1 OR 2 BUTTON!");
        choice = keyboard.nextInt();

        if (choice == 1) {

            if ((enter3 > enter2) && (enter2 > enter1))
                System.out.println("Small to large arrangement of numbers is: " + enter1 + "<" + enter2 + "<" + enter3);

            if ((enter3 > enter1) && (enter1 > enter2))
                System.out.println("Small to large arrangement of numbers is: " + enter2 + "<" + enter1 + "<" + enter3);

            if ((enter2 > enter1) && (enter1 > enter3))
                System.out.println("Small to large arrangement of numbers is: " + enter3 + "<" + enter1 + "<" + enter2);

            if ((enter2 > enter3) && (enter3 > enter1))
                System.out.println("Small to large arrangement of numbers is: " + enter1 + "<" + enter3 + "<" + enter2);

            if ((enter1 > enter2) && (enter2 > enter3))
                System.out.println("Small to large arrangement of numbers is: " + enter3 + "<" + enter2 + "<" + enter1);

            if ((enter1 > enter3) && (enter3 > enter2))
                System.out.println("Small to large arrangement of numbers is: " + enter2 + "<" + enter3 + "<" + enter1);
        }
        if (choice == 2) {

            if ((enter3 > enter2) && (enter2 > enter1))
                System.out.println("Large to small arrangement of numbers is: " + enter3 + ">" + enter2 + ">" + enter1);

            if ((enter3 > enter1) && (enter1 > enter2))
                System.out.println("Large to small arrangement of numbers is: " + enter3 + ">" + enter1 + ">" + enter2);

            if ((enter2 > enter1) && (enter1 > enter3))
                System.out.println("Large to small arrangement of numbers is: " + enter2 + ">" + enter1 + ">" + enter3);

            if ((enter2 > enter3) && (enter3 > enter1))
                System.out.println("Large to small arrangement of numbers is: " + enter2 + ">" + enter3 + ">" + enter1);

            if ((enter1 > enter2) && (enter2 > enter3))
                System.out.println("Large to small arrangement of numbers is: " + enter1 + ">" + enter2 + ">" + enter3);

            if ((enter1 > enter3) && (enter3 > enter2))
                System.out.println("Large to small arrangement of numbers is: " + enter1 + ">" + enter3 + ">" + enter2);
        }
    }
}
