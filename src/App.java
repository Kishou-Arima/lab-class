import java.util.Scanner;
public class App 
{
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        double a = sc.nextDouble();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("The Sum is "+(a+b));
    }
}
