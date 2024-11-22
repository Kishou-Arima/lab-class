import java.util.*;
class Arranger
{
    private int arr[]=new int[100];
    private Scanner sc= new Scanner(System.in);
    private int n;
    public void input()
    {
        System.out.println("Enter the number of items in the Array: ");
        n=sc.nextInt();
        System.out.println("The the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public int[] process()
    {
        int[] temp=new int[n];
        int small=0, large=n-1;
        boolean flag=true; 
        for (int i=0;i<n;i++)
        {
            if (flag)
            {
                temp[i]=arr[large--];
            }
            else
            {
                temp[i]=arr[small++];
            }
            flag = !flag;
        }
        return temp;
    }
    public void output()
    {
        int out[]=process();
        System.out.println("The Arranged array is: ");
        for(int i=0;i<out.length;i++)
        {
            System.out.print(out[i]+" ");
        }
    }
}
public class Alternate 
{
    public static void main(String[] args) 
    {
        Arranger a=new Arranger();
        a.input();
        a.output();
    }
}
