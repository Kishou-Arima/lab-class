import java.util.Scanner;
class Fibologic
{
    private Scanner sc = new Scanner(System.in);
    private int input;
    public void input()
    {
        System.out.println("Enter the nth number: ");
        input=sc.nextInt();
    }
    public void compute()
    {
        if(input%2==1)
        {
            fibonacci();
        }
        else
        {
            prime(); 
        }  
    }
    public void fibonacci()
    {
        int a=0;
        int b=1;
        int temp;
        for(int i=1;i<=input/2;i++)
        {
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
    public void prime()
    {
        int n=1;
        int count=0;
        int i;
        while(count<input/2)
        {
            n=n+1;
            for(i=2;i<=n;i++)
            { 
                if(n%i==0) 
                {
                    break;
                }
            }
            if(i==n)
            {
                count=count+1;
            }
        }
        System.out.println(n);
    }
}

public class Series 
{
    public static void main(String[] args) 
    {
        Fibologic obj=new Fibologic();
        obj.input();
        obj.compute();  
    }
}
