import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Filename
{
    private Scanner sc=new Scanner(System.in);
    public String str;
    public void input()
    {
        System.out.println("Enter the text file name: ");
        str=sc.nextLine();
    }
}
public class Filehandle 
{
    public static void main(String[] args) 
    {
        Filename obj=new Filename();
        obj.input();
        try
        {
            File n=new File("C:\\Users\\Public\\"+obj.str+".txt");
            if(n.createNewFile())
            {
                System.out.println("File Created: "+n.getName());
            }
            else
            {
                System.out.println("File exists, please enter a new name.");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error occured! ");
            e.printStackTrace();
        }

    }
}
