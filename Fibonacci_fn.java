import java.util.Scanner;
class Fiblog
{
    private Scanner sc = new Scanner(System.in);
    private static int in;
    private static int n1=0;
    private static int n2=1;
    private static int n3=0;
    public void input()
    {
        System.out.println("Enter a number: ");
        in=sc.nextInt();
    }
    public static void process(int in)
    {
        if(in>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            process(in-1);
        }
    }
    public static void output()
    {
        System.out.print(n1+" "+n2);
        process(in-2);
    }
}
public class Fibonacci_fn 
{
    public static void main(String[] args) 
    {
        Fiblog a= new Fiblog();
        a.input();
        Fiblog.output();
    } 
}
