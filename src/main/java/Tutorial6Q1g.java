import java.util.Scanner;
public class Tutorial6Q1g
{
    public static void Area (int r)
    {
        int area=0;
        area = r*r;
        System.out.println("Area: " + area);


    }
    public static void Circumference(int r)
    {
        double circumference=0.0;
        circumference= 2* Math.PI * r;
        System.out.printf("Circumference: %.2f%n " ,circumference);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius:");
        int r=input.nextInt();
        Area(r);
        Circumference(r);
    }
}
