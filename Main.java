import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner (System.in);
    System.out.println("input a double");
    double radius = userInput.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println(circle.getRadius());
    System.out.println(circle.getCircumference());

    System.out.println("input a int and a double");
    int numOfSides = userInput.nextInt();
    double sideLength = userInput.nextDouble();
    RegularPolygon poly = new RegularPolygon (numOfSides, sideLength);
    System.out.println(poly);
    System.out.println(poly.getArea());
    poly.addSides(2);
    System.out.println(poly);
    System.out.println(poly.getArea());
  }
}
