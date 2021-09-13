package downcastingexp;
public class B extends A {	
		int j=20;
		public static void main(String[] args)
		{
	A a1=new A();
	B b1=new B();
	a1=b1;// first up casting
	b1=(B) a1;//then down casting
	System.out.println(b1.i);
	System.out.println(b1.j);
	}
	}


