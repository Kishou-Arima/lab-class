import java.util.Scanner;
class Fib
{   
    private Scanner sc = new Scanner(System.in);
    private int in;
    public void input()
    {
        System.out.println("Enter the number of the series: ");
        in=sc.nextInt();
    }
    public void fibonacci1()
    {
        int a=0;
        int b=1;
        int temp;
        for(int i=1;i<=in;i++)
        {
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
    
}
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Fib obj=new Fib();
        obj.input();
        obj.fibonacci1();
    }
}
