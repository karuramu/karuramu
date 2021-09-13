package generics;

public class B<x,y,z> {
x i;
y j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a1 =new B();
		a1.i=10;
		a1.j="a";
		a1.i=10.3;
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}
