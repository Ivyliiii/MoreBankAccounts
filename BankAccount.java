import java.util.Scanner;

public class BankAccount {
	private String name;
	private double savings;
	
	public BankAccount(String n, int s) {
		name = n;
		savings = s;
	}
	
	public double getsavings() {
		return savings;
	}
	
	public String getname() {
		return name;
	}
	
	public BankAccount(String n) {
		name = n;
		savings = 0;
	}
	
	
	public void deposit(int n) {
		savings += n;
	}
	
	public void withdraw(int n) {
		savings -= n;
	}
	
	public String toString() {
		return name + ", " + savings;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankAccount user2 = new BankAccount("stmarks", 10000);
		BankAccount user3 = new BankAccount("nobody");
		
		System.out.println(user2);
		System.out.println();
		System.out.println(user3);
		
		
		System.out.println("Please enter your name!");
		String user = s.nextLine();
		
		
		System.out.println("Please enter the current amount of money you have in your bank account!");
		int savings = s.nextInt();
		
		BankAccount user1 = new BankAccount(user, savings);
		
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("Do you want to complete any other actions? To deposit, press'd'. To "
					+ "withdraw money, press 'w'. If you are "
					+ "done, press 'q'.");
			char input = s.next().charAt(0);
			if(input == 'd') {
				System.out.println("How much money do you want to deposit?");
				user1.deposit(s.nextInt());
				System.out.println(user1.getsavings());
				System.out.print(user1.getname() + ", you now have " + user1.getsavings());
	
			}
			
			else if(input == 'w') {
				System.out.println("How much money do you want to withdraw?");
				user1.withdraw(s.nextInt());
				System.out.print(user1.getname() + ", you now have " + user1.getsavings());
				
			}

			else if(s.next().charAt(0) == 'q') {
				run = false;
			}
			
			else {
				System.out.println("INVALID INPUT! Please enter again! Do you want to complete any other actions? To deposit, press'd'. To "
						+ "withdraw money, press 'w'. To add in the interest, press 'i'. If you are "
						+ "done, press 'q'.");
			}
		}
	}
}
