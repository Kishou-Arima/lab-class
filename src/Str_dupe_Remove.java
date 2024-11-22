import java.util.*;
class Dupe_logic
{
    private Scanner sc= new Scanner(System.in);
    private String s;
    private char[] ch;
    public void input()
    {
       System.out.println("Enter a String: ");
       s=sc.nextLine();
       s=s.toLowerCase();
       ch=s.toCharArray();        
    }
    public void process()
    {
        int index=0;
        for(int i=0;i<ch.length;i++)
        {
            int j;
            for(j=0;j<i;j++)
            {
                if (ch[i]==ch[j])
                {
                    break;
                }
            }
            if(j==i)
            {
                ch[index++]=ch[i];
            }
        }
        System.out.print(String.valueOf(Arrays.copyOf(ch,index)));
    }
    public void output()
    {
        System.out.println("The new String Is: ");
        process();
    }
}
public class Str_dupe_Remove 
{
    public static void main(String[] args) 
    {
        Dupe_logic a=new Dupe_logic();
        a.input();
        a.output();
    }
}
