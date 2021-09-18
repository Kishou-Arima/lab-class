import java.util.Scanner;
class FactLogic
{
    private Scanner sc = new Scanner(System.in);
    private int input;
    public void input()
    {
        System.out.println("Enter a number: ");
        input=sc.nextInt();
    }
    public int fact()
    {    
        int f=1;
        for(int i=1;i<=input;i++)
        {
            f=f*i;
        }
        return f;  
    }
    public void output()
    {
        System.out.println("The Factorial is "+fact());
    }

}

public class Factorial 
{
    public static void main(String[] args) 
    {
        FactLogic a=new FactLogic();
        a.input();
        a.output();
    }
}
