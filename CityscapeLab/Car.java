import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

/**
 * Creates a car object that can be animated to move forward
 *      by changing the value of x-position of all the parts
 * 
 * @author Alex Arnold
 * @version (10/11/15)
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;  //defines the starting x-position for the compononents of the car
    private int yTop;   //defines the starting y-position for the componenents of the car
    private int width;  //defines the width of the car body in terms of pixels
    private int height; //defines the height of the car body in terms of pixels
    
    /**
     * Constructs car with a given top left corner and predetermined width and height
     * @param   x   the x-cord of the top-left corner   
     * @param   y   the y-cord of the top-left corner
     * @param   w   the width of the car (along the x axis)
     * @param   h   the height of the car (along the y axis)
     */
    public Car(int x, int y, int w, int h)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        width = w;
        height = h;
    }
    
    /**
     * Draws the body of the car and the two wheels based off of values passed in to the parameters
     *      in the CityscapeComponent Constructor
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //bottom frame
        Rectangle carBot = new Rectangle(xLeft, yTop, width, height);
        //top 
        Rectangle carTop = new Rectangle(xLeft + 5, 455, 26, 10);
        //wheel 1
        Ellipse2D.Double wheel1 
            = new Ellipse2D.Double(xLeft + 2, yTop + 4, 12, 12);
        //wheel 2
        Ellipse2D.Double wheel2 
            = new Ellipse2D.Double(xLeft + 25, yTop + 4, 12, 12); 
        //draw the components
        g2.setColor(Color.YELLOW);
        g2.fill(carBot);
        g2.draw(carTop);
        g2.fill(carTop);
        g2.setColor(Color.BLACK);
        g2.fill(wheel1);
        g2.fill(wheel2);
    }
    
    /**
     * Animates the car by changing the value of the x-position of the components that make up the car
     * @param  x   how many pixels the car will move per second (to the right)
     */
    public void changeXPos(int x)
    {
        this.xLeft += x;
    }
}



