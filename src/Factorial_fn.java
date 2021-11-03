import java.util.Scanner;
class Fact_logic
{
    private Scanner sc = new Scanner(System.in);
    private int input;
    public void input()
    {
        System.out.println("Enter a number: ");
        input=sc.nextInt();
    }
    public long fact(int input)
    {    
        if(input==0)
        {
            return 1;
        }
        else
        {
            return fact(input-1);
        }
    }
    public void output()
    {
        System.out.println("The Factorial is "+fact(input));
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
