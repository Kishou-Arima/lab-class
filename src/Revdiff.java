import java.util.Scanner;
class RevdiffLogic
{
    private Scanner sc = new Scanner(System.in);
    private int input;
    private int revnumber;
    public void input()
    {
        System.out.println("Enter the number to be reversed: ");
        input=sc.nextInt(); 
    }
    public void rev()
    {
        int rem;
        revnumber=0;
        int temp=input;
        while(temp!=0)
        {
            rem=temp%10;
            revnumber=(revnumber*10)+rem;
            temp=temp/10;
        }
        System.out.println("The Reverse is: "+ revnumber);
    }
    public void output()
    {
        System.out.println("The Difference is: "+ Math.abs(revnumber-input));
    }
}
public class Revdiff 
{
    public static void main(String[] args) 
    {
        RevdiffLogic a=new RevdiffLogic();
        a.input();
        a.rev();
        a.output();   
    }
}