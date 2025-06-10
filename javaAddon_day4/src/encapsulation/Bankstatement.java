package encapsulation;

class Sbiacc{
	private String Accholder;
	private int Balance;


    Sbiacc(String Accholder,int Balance){
	this.Accholder=Accholder;
	this.Balance=Balance;
}
    public String getAccholder() {
		return Accholder;
	}
    public int getBalance() {
    	return Balance;
    }
    public void deposit(int deposit) {
    	if(Balance >0) {
    		Balance +=deposit;
    	System.out.println("Deposit Amount ="+deposit);
    	System.out.println("Now Current Balance:"+Balance);
    	}
    }
    public void getAccholder(String Accholder) {
    	this.Accholder=Accholder;
    	
    }
    public void getBalance(int Balance) {
    	this.Balance=Balance;
    }
    public void setAccholder(String Accholder) {
    	this.Accholder=Accholder;
    }
    public void setwithdraw(int withdraw) {
    	Balance-=withdraw;
    	System.out.println("Withdraw Amount:"+withdraw);
    }
    
}


public class Bankstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbiacc in =new Sbiacc("Gojo",55555);
		System.out.println("Account holder name: "+in.getAccholder());
		in.getAccholder("Gojo");
		System.out.println("");
		System.out.println("The balance:"+in.getBalance());
		in.deposit(2000);
		in.setwithdraw(5555);
		System.out.println("Current Balance :"+in.getBalance());
	
	
	}

}
