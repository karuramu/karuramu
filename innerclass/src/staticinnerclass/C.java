package staticinnerclass;

public class C {
	class C1 extends D {
		int i = 10;
	}

	static class D {
		int j = 25;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		C1 c2 = c1.new C1();
		System.out.println(c2.i);
		System.out.println(c2.j);

// we can't not create main method in local inner class bcz static method in inner class give error
		
	}
}
