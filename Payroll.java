import java.util.Scanner;
public class Payroll
{
    public static void main(String[] args)
    {

// Variables and Constants.
        double hoursWorked;
        double payRate;
        double regPay;
        double otPay;
        final int FULL_WEEK = 40;
        final double OT_RATE = 1.5;
        Scanner kbd = new Scanner(System.in);

// Input Phase.
        System.out.print("\nPlease. Enter. Hours. Worked. *beep* *boop* >> ");
        hoursWorked = kbd.nextDouble();
        System.out.print("*beep *boop* Please. Enter. Your. Regular. Pay. >> ");
        payRate = kbd.nextDouble();
        kbd.close();
// Processing Phase.
        if (hoursWorked > FULL_WEEK)
        {
            regPay = FULL_WEEK * payRate;
            otPay = (hoursWorked - FULL_WEEK) * payRate * OT_RATE;
        }
        else
        {
            regPay = hoursWorked * payRate;
            otPay = 0.0;
        }// End of if.





// Output Phase.
        System.out.println("Regular pay is: " + regPay + "\n Overtime pay is: " + otPay);

    } // End of main.



















} // End of class block.