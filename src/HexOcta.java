import java.util.Scanner;
class Num 
{
    int n;
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("Enter the value : ");
        n = sc.nextInt();
    }
    public void showNum() 
    {
        System.out.println("The number is " + n);
    }
}
class HexNum extends Num 
{
    public void showNum() 
    {
        System.out.println("The hexadecimal numbe is :" + Integer.toHexString(n));
    }
}
class OctNum extends Num 
{
    public void showNum() 
    {
        System.out.println("The octal number is :" + Integer.toOctalString(n));
    }
}
public class HexOcta 
{
    public static void main(String args[]) 
    {
        HexNum obj = new HexNum();
        obj.input();
        obj.showNum();
        OctNum obj1 = new OctNum();
        obj1.input();
        obj1.showNum();
    }
        
}