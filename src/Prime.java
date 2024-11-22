import java.util.Scanner;

class Primelogic
{
    private Scanner sc = new Scanner(System.in);
    private int n;
    public void input()
    {
        System.out.println("Enter the n: ");
        n=sc.nextInt();
    }
    public void prime()
    {
        int num=1;
        int count=0;
        int i;
        while(count<n)
        {
            num=num+1;
            for(i=2;i<=num;i++)
            { 
                if(num%i==0) 
                {
                    break;
                }
            }
            if(i==num)
            {
                count=count+1;
            }
        }
        System.out.println(num);
    }
}

public class Prime 
{
    public static void main(String[] args) 
    {
        Primelogic obj=new Primelogic();
        obj.input();
        obj.prime();
    }
} 
