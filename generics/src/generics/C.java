package generics;

public class C<K> {

	K i;// generic variable can't make it has static 
	K j;//generic variable can't use as local variable 
	C a1;

	public K test() {// we can't make generic static method also
		a1 = new C();
		a1.i = 30;
		return i;
	}

	public static void main(String[] args) {
		C a2 = new C();
		// a2.j = a2.test();
		 a2.test();// K j =a2.test() we can't write bcz generic s can't be used haslocal variable
		System.out.println(a2.i);
	}
}
