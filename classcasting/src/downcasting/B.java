package downcasting;

// no compile time error but it will give run time exception

public class B extends A{
int j=20;
	public static void main(String[] args)
	{
B b1= (B)new A();
System.out.println(b1.i);
System.out.println(b1.j);	
}

	

}
