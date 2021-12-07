import java.util.Scanner;
class Num 
{
    int n;
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("Enter the value : ");
        n=sc.nextInt();
    }
    public void showNum() 
    {
        System.out.println("The number is "+n);
    }
}

class OctNum extends Num 
{
    public void showNum() 
    {
        System.out.println("The octadecimal number is :"+Integer.toOctalString(n));
    }
}

public class Octmaker 
{
    public static void main(String[] args) 
    {
        OctNum obj=new OctNum();
        obj.input();
        obj.showNum();
    }
}

