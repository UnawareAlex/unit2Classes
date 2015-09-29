

/**
 * Write a description of class Annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Annuity
{
    /** description of instance variable x (add comment for each instance variable) */
    private int payment;
    private double compoundRate;
    private int numPayments;

    public Annuity()
    {
        // initialise instance variables
        payment = 10000;
        compoundRate = .08;
        numPayments = 20;
    }

    public void sampleMethod(int payment, double compoundRate, int numPayments)
    {
        // put your code here
        double i = compoundRate;
        int n = numPayments;
        int pmt = payment;
        double value = 34;
    }

}
