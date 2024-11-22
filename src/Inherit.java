class Car
{
    String carname="Mazda";
}
public class Inherit extends Car
{
    String model="Miata";
    public static void main(String[] args) 
    {
        Inherit a=new Inherit();
        System.out.println("The car is: "+a.carname+" "+a.model);
    }
}
