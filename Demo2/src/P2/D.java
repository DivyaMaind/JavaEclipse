package P2;
import P1.A;
class D extends A {
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1);private
		System.out.println(c1);//yes : only sub class
		//System.out.println(d1);//no only for same package
	}

}
class E {
	void display()
	{
		A a = new A();
		System.out.println(a.a1);
		//System.out.println(a.b1);
		//System.out.println(a.c1);because its not sub class
		//System.out.println(a.d1);
	}
	
}
class F extends A
{
	void display()
	{
		
		System.out.println(a1);
		//System.out.println(b1);
		System.out.println(c1);
		//System.out.println(d1);
	}
}
