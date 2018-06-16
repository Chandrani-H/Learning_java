import java.io.*;
import java.util.*;
public class strrev {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		StringBuffer s=new StringBuffer(str);
		
		s.reverse();
		 System.out.println(s);
		
		/*
		 * REVERSE USING byte[]
		 * 
		 byte [] ByteArr = str.getBytes();
		 
		 //to print ByteArr
		 //for (int i = 0; i<ByteArr.length; i++)
	       //     System.out.print(ByteArr[i]);
		 
	        byte [] revstr = 
	                   new byte [ByteArr.length];
	 
	        // Store result in reverse order into the result byte[]
	        for (int i = 0; i<ByteArr.length; i++)
	            revstr[i] = ByteArr[ByteArr.length-i-1];
	 
	        System.out.println();
	        //print reverse byte array
			// for (int i = 0; i<ByteArr.length; i++)
		      //      System.out.print(revstr[i]);
	        
	        System.out.println(new String(revstr));
	*/
	}

}
