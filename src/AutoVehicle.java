import java.util.Scanner;
class Vehicle 
{
    protected int regnNumber=1902982;
    protected float speed=118.5f;
    protected String colour="Black";
    protected String ownerName="Mohit";
    public void showData() 
    {
        System.out.println("This is a vehicle class");
        System.out.println("The registration number is "+regnNumber);
        System.out.println("The max speed is "+speed);
        System.out.println("The colour is "+colour);
        System.out.println("The Owner Name is "+ownerName);
    }
}
class Bus extends Vehicle 
{
    private int routeNumber;
    Scanner sc=new Scanner(System.in);
    public void showData() 
    {
        super.showData();
        System.out.println("This vehicle's route Number is "+routeNumber);
    }
    public void input() 
    {
        System.out.print("Enter the route number: ");
        routeNumber=sc.nextInt();
    }
}
class Car extends Vehicle 
{
    private String manufacturerName;
    Scanner sc=new Scanner(System.in);
    public void input() 
    {
        System.out.println("Enter the manufacturer Name: ");
        manufacturerName=sc.nextLine();
    }
    public void showData() 
    {
        super.showData();
        System.out.println("This vehicle's manufacturer Name is "+manufacturerName);
    }
}
public class AutoVehicle extends Vehicle 
{
    public static void main(String args[]) 
    {
        Bus a=new Bus();
        a.input();
        a.showData();
        Car obj1=new Car();
        obj1.input();
        obj1.showData();
    }
}