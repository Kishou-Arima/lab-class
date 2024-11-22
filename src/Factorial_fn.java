import java.util.Scanner;
class Fact_logic
{
    private Scanner sc = new Scanner(System.in);
    private int in;
    public void input()
    {
        System.out.println("Enter a number: ");
        in=sc.nextInt();
    }
    public int fact(int in)
    {    
        if(in==0)
        {
            return 1;
        }
        else
        {
            return (in*fact(in-1));
        }
    }
    public void output()
    {
        int f=fact(in);
        System.out.print("The Factorial is "+f);
    }

}

public class Factorial_fn 
{
    public static void main(String[] args) 
    {
        Fact_logic a=new Fact_logic();
        a.input();
        a.output();
    }
}
