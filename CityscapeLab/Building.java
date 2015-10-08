import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

/**
 * Write a description of class Buildings here.
 * 
 * @author Alex Arnold
 * @version 1
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    private int wndLeft;
    private int wndTop;
    private final int wndWidth;
    private final int wndHeight;

    /**
     * Constructs building with a given top left corner and predetermined length and heighth
     * @param   x   the x-cord of the top-left corner   
     * @param   y   the y-cord of the top-left corner
     * @param   w   the width of the building (along the x axis)
     * @param   h   the height of the buuilding (along the y axis)
     */
    public Building(int x, int y, int w, int h)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        width = w;
        height = h;
        wndLeft = x + 4;
        wndTop = y + 4;
        wndWidth = 2;
        wndHeight = 2;
        
    }
    
    /**
     * Draws the building
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //main body of the building
        Rectangle frame = new Rectangle(xLeft, yTop, width, height);
        Rectangle window = new Rectangle(wndLeft, wndTop, wndWidth, wndHeight);

        g2.setColor(Color.DARK_GRAY);
        g2.draw(frame);
        g2.fill(frame);
        
        g2.setColor(Color.YELLOW);
        g2.draw(window);
        g2.fill(window);
    }

}
