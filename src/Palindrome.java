import java.util.*;
class Palindrome_logic
{
    private Scanner sc= new Scanner(System.in);
    private int n;
    private int temp;
    private int s;
    public void input()
    {
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    public void process()
    {
        s=0;
        int r;
        temp=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }  
    }
    public void output()
    {
        process();
        if(temp==s)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
    }
}
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Palindrome_logic a = new Palindrome_logic();
        a.input();
        a.output();
    }
}