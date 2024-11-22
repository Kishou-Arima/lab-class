class Automobiles
{
    void drive()
    {
        System.out.println("That's a car");
    }
}
public class Override extends Automobiles
{
    void drive()
    {
        System.out.println("This is a car");
    }
    public static void main(String[] args) 
    {
        Override a=new Override();
        a.drive();
    }
}
