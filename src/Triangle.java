import java.util.*;
class Triangle_finder
{
    private int arr[]=new int[100];
    private Scanner sc= new Scanner(System.in);
    private int n;
    public void input()
    {
        System.out.println("Enter the number of items in the Array: ");
        n=sc.nextInt();
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public int process()
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if ((arr[i]+arr[j]>arr[k])&&(arr[i]+arr[k]>arr[j])&&(arr[k]+arr[j]>arr[i]))
                        count++;
                }
            }
        }
        return count;
    }
    public void output()
    {
        System.out.println("The number of possible triangles is: "+process());
    }
}
public class Triangle 
{
    public static void main(String[] args) 
    {
        Triangle_finder a=new Triangle_finder();
        a.input();
        a.output();
    }
}