import java.util.Scanner;
class Distance 
{
    Scanner sc = new Scanner(System.in);
    float distance;
    public float travelTime() 
    {
        float result = 0.0f;
        result = distance / 60.0f;
        return result;
    }

    public void takeInp() 
    {
        
        System.out.print("Enter the distance : ");
        distance = sc.nextFloat();
    }

    public void showMks(float num) 
    {
        System.out.println("Time : " + num + " H ");
    }
}
class DistanceMKS extends Distance 
{
    public DistanceMKS(float k) 
    {
        super.distance = k;
    }

    public float travelTime() 
    {
        float result = 0.0f;
        result = distance / 100;
        return result;
    }

    public void show(float num) 
    {
        System.out.println("Time : " + num + " s");
    }
}

public class LocTravel 
{
    public static void main(String[] args) 
    {
        float num;
        Distance obj = new Distance();
        obj.takeInp();
        obj.showMks(obj.travelTime());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance : ");
        num = sc.nextFloat();
        DistanceMKS obj1 = new DistanceMKS(num);
        obj1.show(obj1.travelTime());
        sc.close();
    }
}