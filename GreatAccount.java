
public class GreatAccount extends BankAccount{
	
	private int times;
	private boolean notWithdraw;
	
	public GreatAccount(String name, int s, int times, boolean notWithdraw) {
		super(name, s);
		this.times = times;
		this.notWithdraw = notWithdraw;
	}
	
	public void canWithdraw(int amount) {
		if(times > 2) {
			System.out.println("You may not withdraw!");
		}
		else {
			super.withdraw(amount);
			times++;
			notWithdraw = false;
		}
	}
	
	public void nextMonth() {
		times = 0;
	}
	
	public void doubleSavings() {
		if (notWithdraw){
			super.deposit((int)super.getsavings());
		}
	}
	
	public void resetYear() {
		notWithdraw = true;
	}
	
	public String toString() {
		return super.getname() + ", " + super.getsavings() + ", " + times + ", " + notWithdraw;
	}
	
	public static void main(String[] args) {
		GreatAccount StMarks = new GreatAccount("stmarks", 1000000, 0, true);
		System.out.println(StMarks);
		StMarks.canWithdraw(10000);
		System.out.println("Withdrawed: " + StMarks);
		StMarks.nextMonth();
		StMarks.resetYear();
		System.out.println("Reset-ed: " + StMarks);
		
	}
	

}
