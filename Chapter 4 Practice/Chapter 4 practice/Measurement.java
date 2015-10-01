import java.util.Scanner;

public class Measurement
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a measurement in meters: ");
        double met = s.nextDouble();
        double feet = met*3.28084;
        double miles = met*.000621371;
        double inches = met*39.3701;
        System.out.println(met + " meters is equal to " + inches + " inches");
        System.out.println(met + " meters is equal to " + feet + " feet");
        System.out.println(met + " meters is equal to " + miles + " miles");
    }
}

        