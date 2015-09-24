public class DistanceConverter
{
   public static void main(String[] args)
   {
      double yards = 3.5;
      final double feet = yards * 3;
      final double inches = feet * 12;
      
      System.out.println(yards + " yards are " + feet + "feet");
      System.out.println(yards + " yards are " + inches + "inches");
   }
}