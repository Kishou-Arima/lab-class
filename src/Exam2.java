import java.util.Scanner;
class Freq
{
    private Scanner sc=new Scanner (System.in);
    private String str;
    public void input()
    {
        System.out.println("Enter a String: ");
        str=sc.nextLine();
        str=str.toLowerCase();
    }
    public void process()
    {
        int l=str.length();
        int f[]=new int[100];
        for (int i=0;i<l;i++)
        {
            f[str.charAt(i)-'a']++;
        }
        for (int i=0;i<l;i++) 
        {

            if (f[str.charAt(i)-'a']!=0) 
            {
                System.out.print(str.charAt(i)+"-");
                System.out.print(f[str.charAt(i)-'a']+"\n");
                f[str.charAt(i)-'a']=0 ;
            }
        }
    }
}
public class Exam2
{
    public static void main(String args[])
    {
        Freq obj=new Freq();
        obj.input();
        obj.process();
    }
}