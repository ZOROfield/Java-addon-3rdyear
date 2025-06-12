package Threads;

public class Threading extends Thread{
public void run() {
	
	for(int i=1;i<=10;i++) {
		
	
	System.out.println("Haii thread    :"+i);
}}}
class Execute{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading m=new Threading();
		m.start();
	}

}
