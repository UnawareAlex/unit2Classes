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
 * Creates a background image for the Cityscape by randomly choosing a URL from an array, which is then
 *      passed into a draw method
 * 
 * @author Alex Arnold
 * @version (10/11/15)
 */
public class SkyNight
{
    /** description of instance variable x (add comment for each instance variable) */
    private BufferedImage img;  //defines the image location (URL)

    /**
     * Default constructor for objects of class Sky
     */
    public SkyNight()
    {
        // initialise instance variables
        String[] nightArray;
        nightArray = new String[6];
        nightArray[0] = "https://upload.wikimedia.org/wikipedia/commons/3/37/Pinnacles_Night_Sky_-_Flickr_-_Joe_Parks.jpg";
        nightArray[1] = "http://a.abcnews.go.com/images/Technology/ht_New_York_20_darkened_skies_ll_130307_wblog.jpg";
        nightArray[2] = "http://img09.deviantart.net/4e58/i/2014/134/e/b/coruscant__2_by_daroz-d7idgv0.jpg";
        nightArray[3] = "http://elephanttruths.com/wp-content/uploads/2015/07/night-sky-stars.jpeg";
        nightArray[4] = "https://jacquierobinsonphotography.files.wordpress.com/2013/06/pretty-night-sky-428.jpg";
        nightArray[5] = "http://www.siwallpaper.com/wp-content/uploads/2015/09/night_sky_wallpapers.jpg";
        
        //creates random generator to choose a random URL to import as an image
        Random generator = new Random();
        int x = generator.nextInt(6);
        String imgLoc = nightArray[x];
       
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
