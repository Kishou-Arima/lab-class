import java.util.Scanner;

class Num 
{
    int num;
    Scanner sc = new Scanner(System.in);
    public void input() 
    {
        System.out.println("Enter the value : ");
        num = sc.nextInt();
    }
    public void showNum() 
    {
        System.out.println("The number is " + num);
    }
}

class HexNum extends Num 
{
    public void showNum() 
    {
        System.out.println("The hexadecimal number is :" + Integer.toHexString(num));
    }
}

public class Hexmaker 
{
    public static void main(String[] args) 
    {
        HexNum obj = new HexNum();
        obj.input();
        obj.showNum();
    }
}
