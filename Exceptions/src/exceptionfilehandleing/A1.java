package exceptionfilehandleing;

import java.io.FileOutputStream;

// to write into file 
public class A1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		String s="testing";
		byte[] data=s.getBytes();//why we write s.getBytes() bcz it is inbuilt in method
		 FileOutputStream file=new FileOutputStream("D://exp.txt");
		 System.out.println("writing into the file");
		file.write(data);
		System.out.println("task is completed");
	}catch(Exception e) {
		System.out.println(e);
	}
     
	}


}
