package staticinnerclass;
//example 
//Inherit  local  inner class member to static inner  is not possible
//but inherit from static inner to local inner class is possible
public class B {
class C{
	int i=10;
}
static class D extends C {
	int j=25;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
