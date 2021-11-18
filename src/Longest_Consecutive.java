import java.util.*;
 class Longest_Consecutive_finder
 {
    private int[] arr={49, 1, 3, 200, 2, 4, 70, 5};
    private int n=arr.length;
    public void process()
    {
        int longest=0;
        final HashSet<Integer> hset = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hset.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            int length=1;
            for(int j=arr[i]-1;hset.contains(j);--j)
            {
                hset.remove(j);
                ++length;
            }
            for(int j=arr[i]+1;hset.contains(j);++j)
            {
                hset.remove(j);
                ++length;
            }
            longest=Math.max(longest,length);
        }
        System.out.println(longest);
    }
    public void output()
    {
        System.out.println("The given array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe longest consecutive series is: ");
        process();
    }
 }
public class Longest_Consecutive 
{
    public static void main(String[] args) 
    {
        Longest_Consecutive_finder a=new Longest_Consecutive_finder();
        a.output();
    }    
}
