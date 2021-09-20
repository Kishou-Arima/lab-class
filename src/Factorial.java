import java.util.Scanner;
class FactLogic
{
    private Scanner sc = new Scanner(System.in);
    private int input;
    private int f;
    public void input()
    {
        System.out.println("Enter a number: ");
        input=sc.nextInt();
    }
    public void fact()
    {    
        f=1;
        for(int i=1;i<=input;i++)
        {
            f=f*i;
        }  
    }
    public void output()
    {
        System.out.println("The Factorial is "+f);
    }

}

public class Factorial 
{
    public static void main(String[] args) 
    {
        FactLogic a=new FactLogic();
        a.input();
        a.fact();
        a.output();
    }
}
