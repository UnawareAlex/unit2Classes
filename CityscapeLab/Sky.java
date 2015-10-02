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
        skyArray[0] = "http://i.huffpost.com/gen/2409604/images/o-BEST-SPACE-PHOTOS-2014-facebook.jpg";
        // initialize second element
        skyArray[1] = "https://upload.wikimedia.org/wikipedia/commons/3/37/Pinnacles_Night_Sky_-_Flickr_-_Joe_Parks.jpg";
        // and so forth
        skyArray[2] = "http://a.abcnews.go.com/images/Technology/ht_New_York_20_darkened_skies_ll_130307_wblog.jpg";
        skyArray[3] = "https://upload.wikimedia.org/wikipedia/commons/8/81/Sky_over_Washington_Monument.JPG";
        skyArray[4] = "https://upload.wikimedia.org/wikipedia/commons/f/f9/The_Burning_Sky.JPG";
        skyArray[5] = "https://static.pexels.com/photos/1195/nature-sky-clouds-cloudy.jpg";
        skyArray[6] = "http://alfahadfurniture.com/wp-content/uploads/Cool-Sky-Wallpaper-1024x576.jpg";
        
       Random generator = new Random();
       int x = generator.nextInt(7);
       String imgLoc = skyArray[x];
        
        try {
            URL url = new URL(imgLoc);
            img = ImageIO.read(url);
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
