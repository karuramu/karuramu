package exception;
//null pointer exp 
//if you are accessing members of the class with null ref than we get null pointer exp

public class B {
static  B b1;
int i=10;
public static void main(String[] args) {
	System.out.println(b1.i);
	System.out.println("completed");
}

}
