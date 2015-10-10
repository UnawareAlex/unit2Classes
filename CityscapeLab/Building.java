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
    private int floors;
    private int wndLeft;
    private int wndTop;
    private int num;
    /**
     * Constructs building with a given top left corner and predetermined length and heighth
     * @param   x   the x-cord of the top-left corner   
     * @param   y   the y-cord of the top-left corner
     * @param   w   the width of the building (along the x axis)
     * @param   h   the height of the buuilding (along the y axis)
     */
    public Building(int x, int y, int w, int f )
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        width = w;
        floors = f;
        wndLeft = x - 2;
        wndTop = y - 2;
    }
    
    /**
     * Draws the building
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //draws the main body of the building
        Rectangle frame = new Rectangle(xLeft, yTop, width, 32 + floors*8);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frame);
        g2.fill(frame);
        //randomly determines the state of the window (ON or OFF)
        Random generator = new Random();
        
        //draws the windows
        int numWinY = 1;
        int numWinX = 1;
        while (numWinY < floors*(.8)) //floors multiplied by a factor of floors over floor height
        {
            while (numWinX < width/10)
            {
                Rectangle window = new Rectangle(wndLeft + 10*(numWinX), wndTop + 10*(numWinY), 4, 4);
                this.num = generator.nextInt(2);
                if (num == 0)
                {
                    g2.setColor(Color.YELLOW);
                }
                else
                {
                    g2.setColor(Color.BLACK);
                }
                g2.draw(window);
                g2.fill(window);
                numWinX += 1;
            }
            numWinX = 1;
            numWinY +=1;
        }
    }
}


