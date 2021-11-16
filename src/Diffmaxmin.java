import java.util.*;
class MaxminLogic
{
    private Scanner sc=new Scanner(System.in);
    private int n;
    private int[] arr=new int[20];
    private int max;
    private int min;
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
        max=arr[0];
        min= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min = arr[i];   
        }   
    }
    public void output()
    {
        process();
        System.out.println("The difference is: "+(max-min));
    }
}
public class Diffmaxmin 
{
    public static void main(String[] args) 
    {
        MaxminLogic a=new MaxminLogic();
        a.input();
        a.output();  
    }
}