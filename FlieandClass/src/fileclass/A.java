package fileclass;

import java.io.File;

//creating the file 
public class A

{	
	public static void main(String[] args)
    {
		try {
			File file = new File("D://asdfgh.txt");
			// Create the new file with type
			// check whether file is already created or not syso(file.exist());
			// delete the file syntax is-->file.delete();
			//length of file-->syso(file.length());here length will be in bytes 
			file . createNewFile();  // for creating folder-->file.mkdir(); and for delete also same has file but folder and file can't both at time
			
		    }catch(Exception e) 
		      {
			System.out.println(e);	
		     }
	}

}



