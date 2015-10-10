import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private BufferedImage img;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky()
    {
        // initialise instance variables
        // declares an array of integers
        String[] skyArray;
        // allocates memory for 10 integers
        skyArray = new String[7];  
        // initialize first element
        skyArray[0] = "http://img11.deviantart.net/f8e1/i/2012/206/a/6/tatooine_sunsets_by_snickers109-d58l2p5.jpg";
        // initialize second element
        skyArray[1] = "https://upload.wikimedia.org/wikipedia/commons/3/37/Pinnacles_Night_Sky_-_Flickr_-_Joe_Parks.jpg";
        // and so forth
        skyArray[2] = "http://a.abcnews.go.com/images/Technology/ht_New_York_20_darkened_skies_ll_130307_wblog.jpg";
        skyArray[3] = "https://upload.wikimedia.org/wikipedia/commons/8/81/Sky_over_Washington_Monument.JPG";
        skyArray[4] = "https://upload.wikimedia.org/wikipedia/commons/f/f9/The_Burning_Sky.JPG";
        skyArray[5] = "http://www.wall321.com/thumbnails/detail/20130120/cityscapes%20night%20lights%20futuristic%20artwork%20city%20skyline%20skyscapes%20future%20architecture%201280x1024%20w_www.wall321.com_40.jpg";
        skyArray[6] = "http://img09.deviantart.net/4e58/i/2014/134/e/b/coruscant__2_by_daroz-d7idgv0.jpg";
        
       Random generator = new Random();
       int x = generator.nextInt(7);
       String imgLoc = skyArray[x];
        
        try {
            URL url = new URL(imgLoc);
            this.img = ImageIO.read(url);
        } catch (IOException e) {
        }
    }

    /**
     * Draws a image pulled randomly from the array
     * @param   g2      the graphics context
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
       g2.drawImage(img, 0, 0, 800, 475, null);
    }

}
