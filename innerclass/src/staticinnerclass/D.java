package staticinnerclass;



public class D {
	class C1  {
		int i = 10;
	}

	static class D1 {
		 int k=78;
		public static void main(String[] args) {
			int j = 25;
System.out.println(j);
		}
	}
public static void main(String[] args) {
	D1 d=new D1();
	System.out.println(d.k);
	D1.main(null);// here we are calling the main method of class D1 
	// if we call D.main then we get compile time error  we can't call same method (D.main)inside the main method 
}
}
