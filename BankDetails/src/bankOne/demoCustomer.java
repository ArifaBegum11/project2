package bankOne;

public class demoCustomer {

	public static void main(String[] args) {
		
		CustomerDetails cus= new CustomerDetails();
		cus.setName("Afreen");
		cus.setEmail("afreenenchant@gmail.com");
		cus.setCustomerNumber(1223);
		cus.setPhoneNumber(1234567890);
		cus.setBalance(50000);
		
		//cus.deposit_funds(4000);
		cus.withdraw_funds(6000);

	}
}
