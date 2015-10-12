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
import java.util.Scanner;
/**
 * Creates a background image (daytime) for the Cityscape by randomly choosing a URL from an array, which is then
 *      passed into a draw method
 * 
 * @author Alex Arnold
 * @version (10/11/15)
 */
public class SkyDay
{
    /** description of instance variable x (add comment for each instance variable) */
    private BufferedImage img;  //defines the image location (URL)

    /**
     * Default constructor for objects of class Sky
     */
    public SkyDay()
    {
        // initialise instance variables
        String[] dayArray;
        dayArray = new String[4];
        dayArray[0] = "http://img11.deviantart.net/f8e1/i/2012/206/a/6/tatooine_sunsets_by_snickers109-d58l2p5.jpg";
        dayArray[1] = "https://upload.wikimedia.org/wikipedia/commons/8/81/Sky_over_Washington_Monument.JPG";
        dayArray[2] = "https://upload.wikimedia.org/wikipedia/commons/f/f9/The_Burning_Sky.JPG";
        dayArray[3] = "https://upload.wikimedia.org/wikipedia/commons/7/73/Edmonton_Downtown_Skyline_daytime_new.jpg";

        //creates random generator to choose a random URL to import as an image
        Random generator = new Random();
        int x = generator.nextInt(4);
        String imgLoc = dayArray[x];
       
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
       g2.drawImage(img, 0, 0, 800, 475, null);
    }
}
