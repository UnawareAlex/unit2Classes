

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;
    private String state;
    
    /**
     * Default constructor for objects of class Door
     */
    public Door(String name, String state)
    {
        // initialise instance variables
        this.name = name;
        this.state = state;
    }

    /**
     * Changes the state of the door to "open"
     *
     * @pre        Door must be closed
     */
    public void open()
    {
        // put your code here
        this.state = "open";
    }

    /**
     * Changes the state of the door to "closed"
     * 
     * @pre    Door must be open 
     */
    public void close()
    {
        // put your code here
        this.state = "closed";
    }

    /**
     * Returns the name of the door 
     * 
     */
    public String getName()
    {
        // put your code here
        return this.name;
        
    }

    /**
     * Sets to name of the door to the name passed into the setName method
     *
     * @param   newName   name for door object (i.e. front, side, back)
     */
    public void setName(String newName)
    {
        // put your code here
        this.name = newName;
    }

    /**
     * Returns the current state of the door: "open" or "closed"
     *
     */
    public String getState()
    {
        // put your code here
        return this.state;
    }

    /**
     * Sets the state of the Door to "open" or "closed"
     *
     * @param   newState   state for door object (open or closed)

     */
    public void setState(String newState)
    {
        // put your code here
       this.state = newState;
    }

}
