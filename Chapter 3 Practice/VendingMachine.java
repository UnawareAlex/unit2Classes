

/**
 * Write a description of class VendingMachine here.
 * 
 * @author Arnold
 * @version 1
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int tokens;
    private int cans;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
        // initialise instance variables
        this.tokens = 0;
        this.cans = cans;
    }
    
    /**
     * Fills up the vending machines by adding a specific number of cans, 
     *   which is determined by the parameter
     *  
     * @param   cans   number of cans being added to the vending machine

     */
    public void fillUp(int cans)
    {
        // put your code here
        this.cans += cans;
    }
    
    /**
     * Inserts a token into the vending machine and decreases the amount
     *  of cans by 1
     *
     * @pre     must be cans in the vending machine
     */
    public void insertToken()
    {
        // put your code here
        if (this.cans > 0) {
            this.cans -= 1;
            this.tokens += 1;
        }
        else {
            System.out.println("There are no cans in the machine.");
        }
    }
      
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  returns value of instance variable cans (how many cans there are)
     */
    public int getCans()
    {
        // put your code here
        return this.cans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  returns value of instance variable tokens (how many tokens there are)
     */
    public int getTokens()
    {
        // put your code here
        return this.tokens;
    }

}
