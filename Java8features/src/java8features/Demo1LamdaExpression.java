package java8features;
interface X
{
	void add();

}
interface Cal{
	int mul(int a, int b);
}

public class Demo1LamdaExpression {
	
	public static void main(String[] args) {
		
		X x = new X () {
			public void add() {
				System.out.println("hi demoo..");
			}
		};
		x.add();
		System.out.println("======================");
		X x1 =()->{
			System.out.println("Hi lambda");
		};
		x1.add();                                                        //we can add only one method because its functional interface
		System.out.println("==========@parameter============");
		Cal x2 =(int a, int b)->a*b;
		System.out.println(x2.mul (20,20));
		
	}

}
