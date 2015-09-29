import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("What is the side length: ");
        double l = x.nextDouble();
        System.out.println("What is the width: ");
        double w = x.nextDouble();
        double area = w*l;
        double perimeter = (2*w) + (2*l);
        double diagonal = Math.pow((Math.pow(w, 2) + Math.pow(l, 2)), .5);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Diagonal = " + diagonal);
    }
}