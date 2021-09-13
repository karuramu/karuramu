package constructor;

public class SIB {

	static int i;// only static can be used
	static
	{ 
		i=10;
	System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("from main");
	}

}
// sib run before main  method &it doesn't required any invoking statements
