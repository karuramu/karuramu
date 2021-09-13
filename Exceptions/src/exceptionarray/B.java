package exceptionarray;
/*array is same name of user define class
 * we can use array
 */
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B[] a=new B[3];
B a1=new B();
B a2=new B();
B a3=new B();
a[0]=a1;
a[1]=a2;
a[2]=a3;
for(int i=0;i<a.length;i++)// for(B b:a) also can we use  this line for
//for(B b:a)where B is data type weather class or object or data variable b is to to store data a is array which has to be store
{
	//System.out.println (b);
System.out.println(a[i]);// if i write only  sop(i) in this line i get value or index number of array

}

	}

}
// length of multi demsion array is for row sop(a.length) and clou is sop(a[0].length)