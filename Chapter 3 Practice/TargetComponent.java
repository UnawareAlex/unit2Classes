import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws a target shape
 * 
 * @author Arnold 
 * @version 1
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(0,0,0,0);
        
        Target target2 = new Target(200, 200, 42, 30);
        
        target1.draw(g2);
        target2.draw(g2);
    }
}
        
  