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
    private Car car;
 
    public CityscapeComponent()
    {
        this.sky = new Sky();
        //random generator(s) for position, width and height of buildings in skyline
//         Random generator = new Random();
//             int xLeft_1 = generator.nextInt(651) + 50;
//             int yTop_1 = generator.nextInt(351) + 50;
//             int width_1 = generator.nextInt(151) + 50;
//             int height_1 = (600 - yTop_1) - 125;  
         this.tower1 = new Building(50, 200, 80, 275);
//             int xLeft_2 = generator.nextInt(651) + 50;
//             int yTop_2 = generator.nextInt(351) + 50;
//             int width_2 = generator.nextInt(151) + 50;
//             int height_2 = (600 - yTop_2) - 125;
         this.tower2 = new Building(580, 150, 90, 325);   
//             int xLeft_3 = generator.nextInt(651) + 50;
//             int yTop_3 = generator.nextInt(351) + 50;
//             int width_3 = generator.nextInt(151) + 50;
//             int height_3 = (600 - yTop_3) - 125;
        this.tower3 = new Building(685, 325, 110, 150);
        
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
        //draws the towers
        this.tower1.draw(g2);
        this.tower2.draw(g2);
        this.tower3.draw(g2);
        //draws the car (animated)
        car.draw(g2);

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
