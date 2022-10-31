package day4;

public class DemoGuru99 {

	public static void main(String[] args) {
		
		Guru99 guru= new Guru99();
		
		guru.invokeBrowser();
		
		guru.login("mngr445887","YgyjAdy");
		
		guru.addCustomer();
		
		String customerId= guru.getCustomerId();
		
		System.out.println("Customer Id is "+ customerId);
		
		guru.customerAccount(customerId);

	}

}
