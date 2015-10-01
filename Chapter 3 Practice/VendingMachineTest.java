

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testfillUp()
    {
        VendingMachine machine = new VendingMachine(30);
        machine.fillUp(20);
        assertEquals(50, machine.getCans(), 1e-6);
        machine.fillUp(13);
        assertEquals(63, machine.getCans(), 1e-6);
    }
    
    @Test
    public void testinsertToken()
    {
        VendingMachine machine = new VendingMachine(10);
        machine.insertToken();
        assertEquals(1, machine.getTokens(), 1e-6);
        assertEquals(9, machine.getCans(), 1e-6);
        machine.insertToken();
        assertEquals(2, machine.getTokens(), 1e-6);
        assertEquals(8, machine.getCans(), 1e-6);
    }
    
    @Test
    public void testgetCans()
    {
        VendingMachine machine = new VendingMachine(15);
        assertEquals(15, machine.getCans(), 1e-6);
        machine.fillUp(5);
        assertEquals(20, machine.getCans(), 1e-6);
    }
    
    @Test
    public void testgetTokens()
    {
        VendingMachine machine = new VendingMachine(10);
        assertEquals(0, machine.getTokens(), 1e-6);
        machine.insertToken();
        assertEquals(1, machine.getTokens(), 1e-6);
    }
    
}
