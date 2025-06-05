package Demo;

import java.util.Scanner;

public class Nestedif {

	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the amount:");
		int amt=in.nextInt();
		System.out.println("enter the pin number");
		int pin= in.nextInt();


if(amt<=50000) {
	if(pin==1234) {
		System.out.println("Your withdrawn amount ="+amt);
	}
	else {
	System.out.println("invalid pin");
}
}
	else {
		System.out.println("insufficient amount");

	}
}
}


