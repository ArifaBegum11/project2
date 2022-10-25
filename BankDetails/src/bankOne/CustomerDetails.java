package bankOne;

public class CustomerDetails {
	
	private int customerNumber;
	private int phoneNumber;
	private int balance;	
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name is " +name);
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("Email is " +email);	
	}

	void deposit_funds(int amount) {
		balance += amount;
		System.out.println("balance is" +balance);
	}
	
	void withdraw_funds(int amount) {
		if(amount>balance) {
			System.err.println("Insufficeint balance");
		}
		else {
			balance -=amount;
			System.out.println("balance is " +balance);
		}
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		System.out.println("Customer Number" +customerNumber);
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println("Phone number" +phoneNumber);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance " +balance);
		
	}
}