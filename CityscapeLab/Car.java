import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

/**
 * Write a description of class Car here.
 * 
 * @author Alex Arnold
 * @version 1
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    
    /**
     * Constructs building with a given top left corner and predetermined length and heighth
     * @param   x   the x-cord of the top-left corner   
     * @param   y   the y-cord of the top-left corner
     * @param   w   the width of the building (along the x axis)
     * @param   h   the height of the buuilding (along the y axis)
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
     * Draws the building
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //main body of the building
        int move = 0;
        int time = 0;
        while (time < 5478392)
        {
            Rectangle car = new Rectangle(xLeft + move, yTop, width, height);
            g2.setColor(Color.WHITE);
            g2.draw(car);
            g2.fill(car);
            move += 10;
            time +=1;
        }
    }

}

