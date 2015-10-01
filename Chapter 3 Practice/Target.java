import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A target that can be positioned anywhere on screen.
 * 
 * @author Arnold 
 * @version 1
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int xrad;
    private int yrad;

    /**
     * Constructs target with given top left corner
     * @param x     the x-cordinate of the top-left corner
     * @param y     the y-cordinate of the top-left corner
     */
    public Target(int x, int y, int w, int h)
    {
       xLeft = x;
       yTop = y;
       xrad = w;
       yrad = h;
    }

    /**
     * Draws the target
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1
            = new Ellipse2D.Double(xLeft + 90, yTop + 90, xrad + 10, yrad + 10);
        Ellipse2D.Double circle2
            = new Ellipse2D.Double(xLeft + 85, yTop + 85, xrad + 20, yrad + 20);
        Ellipse2D.Double circle3
            = new Ellipse2D.Double(xLeft + 80, yTop + 80, xrad + 30, yrad + 30);
        Ellipse2D.Double circle4
            = new Ellipse2D.Double(xLeft + 75, yTop + 75, xrad + 40, yrad + 40);
        Ellipse2D.Double circle5
            = new Ellipse2D.Double(xLeft + 70, yTop + 70, xrad + 50, yrad + 50);
        
        g2.setColor(Color.BLACK);
        g2.draw(circle5);
        g2.fill(circle5);
        g2.setColor(Color.WHITE);
        g2.draw(circle4);
        g2.fill(circle4);
        g2.setColor(Color.BLACK);
        g2.draw(circle3);
        g2.fill(circle3);
        g2.setColor(Color.WHITE);
        g2.draw(circle2);
        g2.fill(circle2);
        g2.setColor(Color.BLACK);
        g2.draw(circle1);
        g2.fill(circle1);
    }

}
