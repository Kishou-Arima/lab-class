import java.util.Scanner;
import java.lang.String;
class Splitterlogic
{
    private int n;
    private Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter Number: ");
        n=sc.nextInt();
    }
    public void process()
    {
        String num= Integer.toString(n);
        for(int i=0;i<num.length();i++)
        {
            System.out.print(num.charAt(i));
        }
    }
}

public class Digits 
{
    public static void main(String[] args) 
    {
        Splitterlogic obj1 = new Splitterlogic();
        obj1.input();
        obj1.process();
    }
}
