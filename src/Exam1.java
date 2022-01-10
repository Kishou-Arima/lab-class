class Person
{
    long salary=25000;
    public void display()
    {
        System.out.println("The Salary is: "+salary);
    }
}
class Politician extends Person
{
    Politician()
    {
        salary=salary+50000;
    }
    public void display()
    {
        System.out.println("The Salary of Politician is: "+salary);
    }
}
class Sportsman extends Person
{
    Sportsman()
    {
        salary=salary+15000;
    }
    public void display()
    {
        System.out.println("The Salary of Sportsman is: "+salary);
    }
}
public class Exam1 
{
    public static void main(String args[]) 
    {
        Politician p=new Politician();
        p.display();
        Sportsman s=new Sportsman();
        s.display();
    }
}
