package exception;

public class B3 {
static B3 b1;
int i=10;
B3(){
	System.out.println("from arg");
}
B3(B3 b2){
	System.out.println(b2.i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B3 b1=new B3();
System.out.println(b1);
new B3(b1);
	}

}
/*in above prg ref variable b1 have  address of an object
 * such that there is no null ref is called the member of the class in the above prg
* run the prg to understand
*/