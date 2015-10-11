import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

/**
 * Creates a building object that can be set to a specific position, width, and height
 * 
 * @author Alex Arnold
 * @version (10/11/15)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;      //defines the starting x-position for the building
    private int yTop;       //defines the starting y-position for the building
    private int width;      //defines the width along the x-axis in pixels
    private int floors;     //defines the number of floors the building has
    private int wndLeft;    //defines the starting x-position for the windows
    private int wndTop;     //deinfes the starting y-position for the windows
    /**
     * Constructs building with a given top left corner and predetermined length and number of floors
     * @param   x   the x-cord of the top-left corner of the building   
     * @param   y   the y-cord of the top-left corner of the building
     * @param   w   the width of the building (along the x axis)
     * @param   f   the number of floors in the building 
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
     * Draws the building and windows
     * @param g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //creates random generator for use in determining state of windows 
        Random generator = new Random();
        //draws the main body of the building
        Rectangle frame = new Rectangle(xLeft, yTop, width, 32 + floors*8);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frame);
        g2.fill(frame);
        //draws the windows
        int numWinY = 1;
        int numWinX = 1;
        while (numWinY < floors*(.8)) //floors multiplied by a factor of floors over floor height
        {
            while (numWinX < width/10)
            {
                Rectangle window = new Rectangle(wndLeft + 10*(numWinX), wndTop + 10*(numWinY), 4, 4);
                int num = generator.nextInt(2); //randomly generates value (0,1) to determine window color
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


