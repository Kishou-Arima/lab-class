import java.util.Scanner;
class Sorter
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
    public void process()
    {
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public void output()
    {
        System.out.println("The sorted array is: ");
        process();
    }

}
public class Arraysort 
{
    public static void main(String[] args) 
    {
        Sorter a= new Sorter();
        a.input();
        a.output();
    }
}
