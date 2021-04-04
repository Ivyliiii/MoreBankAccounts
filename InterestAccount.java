
public class InterestAccount extends BankAccount{
	private double interest;
	
	public InterestAccount(String n, int s, double interest) {
		super(n, s);
		this.interest = interest;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void addInterest() {
		double savings = super.getsavings();
		savings += savings*interest;
	}
	
	public String toString() {
		return super.getname() + ", " + super.getsavings() + ", " + interest;
	}
	
	public static void main(String[] args) {
		InterestAccount someone = new InterestAccount("someone", 200, 0.01);
		someone.addInterest();
		System.out.println(someone);
	}
}
