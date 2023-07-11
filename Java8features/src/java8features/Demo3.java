package java8features;
interface Bank 
{
	void loan();
	default void OT() {
		System.out.println("hi OT method");
	}
	static void withdraw() {
		System.out.println("hi withdraw method");
	}
}
class Sbi implements Bank
{
	@Override
	public void loan() {
		
	}
}
class Axiz implements Bank
{
	@Override
	public void loan() {
		
	}
}

public class Demo3 {
	
	public static void main(String[] args) {
		Sbi s = new Sbi();s.OT(); //if default we have to create obj
		Bank.withdraw(); //no need of obj creation
	}

}
