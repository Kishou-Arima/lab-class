import java.util.Scanner;

class StudentInfo1 
{
	private int roll_no;
	private String name;
	private String stream;
	private double sub1;
	private double sub2;
	private double totalmarks;

	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public double getSub1() {
		return sub1;
	}
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	
	public double getSub2() {
		return sub2;
	}
	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}
	
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
}

class StudentGetSetLogic
{
	StudentInfo1 stud1 = new StudentInfo1();
	
	public void userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No ");
		stud1.setRoll_no(sc.nextInt());
		
		System.out.println("Enter Name ");
		stud1.setName(sc.next());
		
		System.out.println("Enter Stream ");
		stud1.setStream(sc.next());
		
		System.out.println("Enter 1st Sub Marks ");
		stud1.setSub1(sc.nextDouble());
		
		System.out.println("Enter 2nd Sub Marks ");
		stud1.setSub2(sc.nextDouble());
		
		stud1.setTotalmarks(stud1.getSub1() + stud1.getSub2());
	}
	
	public void display()
	{
		System.out.println("Roll No is " + stud1.getRoll_no());
		System.out.println("Name is "+ stud1.getName());
		System.out.println("Stream is "+ stud1.getStream());
		System.out.println("1st Sub Marks is "+ stud1.getSub1());
		System.out.println("2nd Sub Marks is "+ stud1.getSub2());
		System.out.println("Total Marks is "+ stud1.getTotalmarks());
	}

}


public class StudentGetSetMain {

	public static void main(String[] args) {
		StudentGetSetLogic obj1 = new StudentGetSetLogic();
		obj1.userInput();
		obj1.display();
	}

}
