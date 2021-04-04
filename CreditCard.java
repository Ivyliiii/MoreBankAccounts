public class CreditCard extends InterestAccount{
	public CreditCard(String n, int s, double i) {
		super(n, s, i);
	}
	
	public void addInterest() {
		double savings = super.getsavings();
		savings += savings*super.getInterest();
		savings -= 10;
	}
	
	public void canWithdraw(int amount) {
		if(super.getsavings() - amount < 100) {
			System.out.println("You may not withdraw!");
		}
		else {
			super.withdraw(amount);
		}
	}
	
	public static void main(String[] args) {
		CreditCard card = new CreditCard("ivy", 0, 0.05);
		card.deposit(120);
		System.out.println(card);
		card.canWithdraw(20);
		System.out.println("After withdraw: " + card);
		card.canWithdraw(2);
		card.addInterest();
		System.out.println(card);
	}
	
	
}
