package constructor;

public class C2 {
//iib instance initialization block
	//iib are exc when object are created
	// nor of times iib exc nor of time object is created
	//iib are used for all instance variable at once and that gives us better read ability of code 
	{
		System.out.println("from iib");
	}
	C2(){
		System.out.println("constructor");
	}
	{
		System.out.println("from sib");
	}
	int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new C2().i);// Direct  object is created with out ref 
	}

}
