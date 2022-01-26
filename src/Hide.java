class Noname
{
    public static void m1()
    {
        System.out.println("hello world");
    }
    void m2()
    {
        System.out.println("Hello Earth");
    }
}
public class Hide extends Noname
{
    public static void m1()
    {
        System.out.println("Hello world once again");
    }
    void m2()
    {
        System.out.println("Hello Earth once again");
    }
    public static void main(String[] args) 
    {
        Noname a=new Noname();
        Noname b=new Hide();
        //a.m1();
        //b.m1();
        a.m2();
        b.m2();
    }
}
