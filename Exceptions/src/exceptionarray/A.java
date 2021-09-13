package exceptionarray;
//array helps us to store the data together which of similar kind
//array uses the memory which is continuous and hence memory point of view is not that efficient
public class A {
public static void main(String[] args) {
	int a[]=new int[3]; //or dataType[] arr; (or) --> int[] a
	                    //dataType []arr; (or)  -->int []a
	                    //dataType arr[]; --> int a[]
	a[0]=10;
	a[1]=20;
	a[2]=30;
    a[3]=40;//this line exp arrayIndexOutOfBounds exp
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
   // or for(int i=0;i<3;i++)
    //sop(a[i]);
    // length of array the above prg is for(int i=0;i<a.length;i++)
}// array by default get some value if we don't initialize the value
}
// if you want store heterogeneous data  in array then create array of object 
// Object []d=new Object[any value according to requirement];
// Object class super most class in java and every class we create by default sub -class of object
//in object variable can store any kind of data