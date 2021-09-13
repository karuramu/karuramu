package exceptionfilehandleing;

import java.io.FileInputStream;
// ctrl +shift+o for import class if  required class is present in different package
//compile time exception
// read the file
public class A {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		 FileInputStream file=new FileInputStream("D://exp.txt");
		 // after FileInputStream class we will write the for loop example for(i=0;i<3;i++)
		 System.out.println(file.read());// to read the file //syso((char)file.read())will give the  first chra which store in exp.txt file
		 //syso((char)file.read()) where we are casting number into char
		 //for every letter we have to use for loop example in exp.txt file "nodu"is written to get we use for loop
	}catch(Exception e) {
		System.out.println(e);
	}
     
	}

}
// out put is only number it will be in bytes 
/*FileInuputStream is the class- it help us to read the content of the file example is above
*
*/