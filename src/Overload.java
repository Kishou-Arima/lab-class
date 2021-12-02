import java.lang.Math;
class Overloader
{
    double area(double a,double b)
    {
        return a*b;
    }
    double area(double a)
    {
        return 2*Math.PI*a;
    }
}
public class Overload 
{
    public static void main(String[] args) 
    {
        Overloader a=new Overloader();
        System.out.println(a.area(1.54,2.00));
        System.out.println(a.area(3.08));
    }
}
