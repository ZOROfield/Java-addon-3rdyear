package addonDay3;

public class singlelevel {
void message() {
	System.out.println("hiii");
	
}
}
class subclass1 extends singlelevel{
	void view() {
		System.out.println("welcome");
	}
}
class subclass2 extends subclass1{
	void code() {
		System.out.println("java programming");
	}
}
class main{
	public static void main(String[] args) {
		subclass2 in=new subclass2();
		in.message();
		in.view();
		in.code();
	}

}