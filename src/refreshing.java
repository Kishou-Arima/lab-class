import java.io.*;
/**
 * <h2>Number calc</h2>
 * @author Kishou-Arima
 * 
 */

public class refreshing 
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    /**
     * 
     * @param args Unused
     * @see IOException
     */
    public static void main(String[] args) 
    {
        refreshing obj= new refreshing();
        int res=obj.sum(12, 46);
        System.out.println(res);
    }    
}
