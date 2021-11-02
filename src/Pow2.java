import java.util.Scanner;
 
class Powlogic
{
    private int in;
    private Scanner sc= new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter Number to check: ");
        in=sc.nextInt();
    }
    public boolean calc()
    {
        return in!= 0 && ((in & (in - 1)) == 0);
    }
    public void output()
    {
        if(calc())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
public class Pow2
{
    public static void main(String[] args)
    {
        Powlogic obj1=new Powlogic();
        obj1.input();
        obj1.output();
    }
    
}
