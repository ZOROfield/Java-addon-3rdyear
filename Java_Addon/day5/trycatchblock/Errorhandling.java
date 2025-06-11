package trycatchblock;

import java.util.Scanner;

public class Errorhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			
				int a,b;
				Scanner in=new Scanner(System.in);	
				
				System.out.println("Enter the numnber:");
				a=in.nextInt();
				b=a/0;
				System.out.println(b);
						
	}	
	catch(Exception e){
		System.out.println("error "+e);
	}
//	finally {
//		System.out.println("The block is finished");
//	}
	}

}
