import java.util.*;
class Lex
{
    private Scanner sc= new Scanner(System.in);
    private String s1;
    private String s2;
    public void input()
    {
       System.out.println("Enter 1st String: ");
       s1=sc.nextLine();
       s1=s1.toLowerCase(); 
       System.out.println("Enter 2nd String: ");
       s2=sc.nextLine();
       s2=s2.toLowerCase();      
    }
    public void process()
    {
        int r=s1.compareTo(s2);
        if (r==0)
        {
            System.out.println("They are lexicographically equal");
        }
        else
        {
            System.out.println("They are unequal");
        }
    }        
}
public class Lexico
{
    public static void main(String[] args) 
    {
        Lex a=new Lex();
        a.input();
        a.process();
    }
}