package exception;

public class B2 {
static B2 b1;
int i=10;
B2 (B2 b2){
	try {
	System.out.println(b2.i);
}catch (Exception e)
	{
	System.out.println(e);
	}
}
public static void main(String[] args) {
	 b1=new B2(b1);
}
}
// from null ref we can't call the members in java