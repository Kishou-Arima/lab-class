import java.util.Scanner;
class Armstrong_Logic
{
    private Scanner sc= new Scanner(System.in);
    private int n;
    private int result;
    public void input()
    {
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    public void process()
    {
        result=0;
        int ogn;
        int rem;
        int i=0;
        ogn=n;
        for(;ogn!=0;ogn/=10,++i);
        ogn=n;
        for(;ogn!=0;ogn/=10)
        {
            rem=ogn%10;
            result+=Math.pow(rem, i);
        }
    }
    public void output()
    {
        process();
        if(result==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}
public class Armstrong 
{
    public static void main(String[] args) 
    {
        Armstrong_Logic a= new Armstrong_Logic();
        a.input();
        a.output();
    }
    
}
