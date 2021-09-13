package innerclass;

public class B 
{
	/*
	 * creating class with in another class is called as inner class inner class has
	 * -1 local inner class -2 static inner class -3 Anonymous inner class
	 */
	// local inner class
	class A
	{
		int i = 10;
	}

	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.i);
		
	}
	/*
	 * to access of members of local inner class firstly create object of outer class--
	 *-- then using reference of OuterClass create object of inner class then access the--
	 *-- members of inner class has show in B1.java
	 * 
	 */
}
