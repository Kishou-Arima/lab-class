import java.util.Scanner;
class ThreeDObject 
{
    int l;
    int h;
    int w;
    int sh;
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("\nEnter the length: ");
        l=sc.nextInt();
        System.out.println("Enter the height: ");
        h=sc.nextInt();
        System.out.println("Enter the width: ");
        w=sc.nextInt();
    }
    public double wholeSurfaceArea() 
    {
        return l+h+w;
    }
    public double volume() 
    {
        return l*h*w;
    }
}
class Box extends ThreeDObject 
{
    public double wholeSurfaceArea() 
    {
        return (2*(l*h)+2*(h*w)+2*(l*w));
    }
}
class Cube extends ThreeDObject 
{
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("Enter the Side: ");
        l=sc.nextInt();
    }
    public double wholeSurfaceArea() 
    {
        return 6*l*l;
    }
    public double volume() 
    {
        return l*l*l;
    }
}
class Cylinder extends ThreeDObject 
{
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("\nEnter the Radius: ");
        l=sc.nextInt();
        System.out.println("Enter the length: ");
        h=sc.nextInt();
    }
    public double wholeSurfaceArea() {
        return 2*Math.PI*l*(l+h);
    }
    public double volume() {
        return Math.PI*l*l*h;
    }
}
class Cone extends ThreeDObject 
{
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("\nEnter the Radius: ");
        l=sc.nextInt();
        System.out.println("Enter the height: ");
        h=sc.nextInt();
        System.out.println("Enter the slant height: ");
        sh=sc.nextInt();
    }
    public double wholeSurfaceArea() 
    {
        return Math.PI*l*(sh+l);
    }
    public double volume() 
    {
        return Math.PI*l*l*(h/3);
    }
}
public class ThD 
{
    public static void main(String[] args) 
    {
        Cube a=new Cube();
        a.input();
        System.out.println("\nThe whole surface area of Cube :"+a.wholeSurfaceArea());
        System.out.println("The volume of Cube : "+a.volume());

        Cylinder b=new Cylinder();
        b.input();
        System.out.println("\nThe whole surface area of Cylinder :"+b.wholeSurfaceArea());
        System.out.println("The volume of Cylinder :"+b.volume());

        Box c=new Box();
        c.input();
        System.out.println("\nThe whole surface area of box :"+c.wholeSurfaceArea());
        System.out.println("The volume box : "+c.volume());

        Cone d=new Cone();
        d.input();
        System.out.println("\nThe whole surface area of cone :"+d.wholeSurfaceArea());
        System.out.println("The volume cone : "+d.volume());
    }
}