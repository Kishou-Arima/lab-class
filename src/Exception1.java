import java.io.*;  
class Testthrows1
{  
  void m()throws IOException
  {  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException
  {  
    m();  
  }  
  void p()
  {  
    try
    {  
      n();  
    }
    catch(Exception e)
    {
      System.out.println("exception handled");
    }
    finally
    {
      System.out.println("This is done!");
    }  
  } 
}
public class Exception1
{

  public static void main(String args[])
  {  
    Testthrows1 obj=new Testthrows1();  
    obj.p();  
    System.out.println("normal flow...");  
  }  
}  