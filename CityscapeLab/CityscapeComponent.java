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
    private SkyNight night;     //defines image of sky (if night)
    private SkyDay day;         //defines image of sky (if day)
    private Building tower1;    //defines instance of a building
    private Building tower2;    //defines instance of a building
    private Building tower3;    //defines instance of a building
    private Building tower4;    //defines instance of a building
    private Building tower5;    //defines instance of a building
    private Building tower6;    //defines instance of a building
    private Building tower7;    //defines instance of a building
    private Truck truck;        //defines instance of a truck
    private Car car;            //defines instane of a car
    private int stateSky;       //takes in value passed from Scanner method in Viewer Class to determine time of day
 
    public CityscapeComponent(int x)
    {
        this.night = new SkyNight();
        this.day = new SkyDay();
        this.tower1 = new Building(50, 218, 80, 28);
        this.tower2 = new Building(580, 75, 90, 46);   
        this.tower3 = new Building(685, 363, 110, 10);
        this.tower4 = new Building(178, 371, 70, 9);
        this.tower5 = new Building(150, 395, 60, 6);
        this.tower6 = new Building(270, 187, 120, 32);
        this.tower7 = new Building(400, 323, 150, 15);
        this.truck = new Truck(25, 450, 55, 25);
        this.car = new Car(20, 463, 40, 10);
        this.stateSky = x;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //draws (based on user input) a randomly generated imported image chosen from an array as the sky
        if (this.stateSky == 1) {
            this.night.draw(g2);
        } else {
            this.day.draw(g2);
        }
            
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
        //draws the buildings (Bonus: lights are unitentionally animated!)
        this.tower1.draw(g2);
        this.tower2.draw(g2);
        this.tower3.draw(g2);
        this.tower4.draw(g2);
        this.tower5.draw(g2);
        this.tower6.draw(g2);
        this.tower7.draw(g2);
        //draws the car and the truck
        this.car.draw(g2);
        this.truck.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        this.car.changeXPos(10);
        this.truck.changeXPos(5);
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
