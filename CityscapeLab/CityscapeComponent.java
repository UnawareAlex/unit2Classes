import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    private Sky sky;
    private Building tower1;
    private Building tower2;
    private Building tower3;
    private Building tower4;
    private Building tower5;
    private Car car;
 
    public CityscapeComponent()
    {
        this.sky = new Sky();
        this.tower1 = new Building(50, 218, 80, 28);
        this.tower2 = new Building(580, 75, 90, 46);   
        this.tower3 = new Building(685, 363, 110, 10);
        this.tower4 = new Building(178, 371, 70, 9);
        this.tower5 = new Building(150, 395, 60, 6);
        this.car = new Car(25, 450, 55, 25);
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //draws the sky as an randomly generated imported image chosen from an array
        this.sky.draw(g2);
        //Creates a green base (grass)
        Rectangle ground = new Rectangle(0, 475, 800, 125);
        g2.setColor(Color.GREEN);
        g2.draw(ground);
        g2.fill(ground);
        //Creates a road between the buildings and the grass
        Rectangle road = new Rectangle(0, 475, 800, 10);
        g2.setColor(Color.GRAY);
        g2.draw(road);
        g2.fill(road);
        //draws the towers (lights animated)
        this.tower1.draw(g2);
        this.tower2.draw(g2);
        this.tower3.draw(g2);
        this.tower4.draw(g2);
        this.tower5.draw(g2);
        //draws the car (animated)
        this.car.draw(g2);

        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
