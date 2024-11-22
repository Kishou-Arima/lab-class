import java.util.Scanner;
class Logic 
{
    private int n1;
    private int n2;
    private int gcd;
    private Scanner sc = new Scanner(System.in);
    public void inputUser()
    {
        System.out.println("Enter 1st Number: ");
        n1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        n2=sc.nextInt();
    }
    public void compute()
    {
        gcd=1;
        for(int i=1;i<n1&&i<n2;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                gcd=i;
            }
        }

    }
    public void display()
    {
        System.out.println("The GCD is: "+ gcd);
    }
}  
public class GCD 
{
    public static void main(String[] args) 
    {
        Logic ob1=new Logic();
        ob1.inputUser();
        ob1.compute();
        ob1.display();
    }    
    
}