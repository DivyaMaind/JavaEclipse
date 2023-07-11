package demo;

class A
{
	A()
	{
		System.out.println("A class constructor"); 
	}
	void abc()
	{
		System.out.println("Hi ABC method..!"); 
	}
}

public class demo {

		public static void main(String args[]){  
		     System.out.println("Hello Java"); 
		     
		     A a = new A();
		     a.abc();
		     
		}
	}


