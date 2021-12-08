import java.util.Scanner;
class Vehicle 
{
    int wheels;
    double speed;
}
class Car extends Vehicle 
{
    int p;
    Scanner sc=new Scanner(System.in);
    void input() 
    {
        System.out.println("Enter the car's details:");
        System.out.println("No. ofwheels: ");
        wheels=sc.nextInt();
        System.out.println("Speed of Car(Km/hr): ");
        speed=sc.nextDouble();
        System.out.println("No. of passengers: ");
        p=sc.nextInt();
    }
    void display() 
    {
        System.out.println("No. ofwheels:"+wheels+"\n Speed:"+speed+"km/hr\n No. ofpassengers:"+p);
    }
}
class Truck extends Vehicle 
{
    double limit;
    Scanner sc = new Scanner(System.in);
    void input() 
    {
        System.out.println("Enter the Truck's details:");
        System.out.println("Number of wheels: ");
        wheels=sc.nextInt();
        System.out.println("Speed of Truck(Km/hr): ");
        speed=sc.nextDouble();
        System.out.println("Load limit(Kg): ");
        limit=sc.nextDouble();
    }
    void display() 
    {
        System.out.println("No. ofwheels:"+wheels+"\n Speed:"+speed+"km/hr\n Load limit:"+limit+"kg");
    }
}
public class SpeedCarTruck 
{
    public static void main(String args[]) 
    {
        Car a=new Car();
        Truck b=new Truck();
        a.input();
        b.input();
        if (a.speed > b.speed)
            System.out.println("Car is faster");
        else
            System.out.println("Truck is faster");
        a.display();
        b.display();
    }
}