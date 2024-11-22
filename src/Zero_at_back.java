import java.util.*;
class No_zero
{
    private Scanner sc=new Scanner(System.in);
    private int n;
    private int[] arr=new int[20];
    public void input()
    {
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void process()
    {
        int i=0;
        for(int j=0;j<n;)
        {
            if(arr[j]==0)
                j++;
            else
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j++;
            }
        }
        while(i<n)
            arr[i++]=0;
    }
    public void output()
    {
        process();
        System.out.println("The arranged array is: ");
        for(int a=0;a<n;a++)
        {
            System.out.print(arr[a]+" ");
        }
    }
}
public class Zero_at_back 
{
   public static void main(String[] args) 
   {
        No_zero ob=new No_zero();
        ob.input();
        ob.output();   
   }
}