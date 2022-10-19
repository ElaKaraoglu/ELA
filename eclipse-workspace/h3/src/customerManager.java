
public class customerManager {
     Customer customer;
    IcreditManager creditmanager;
	public customerManager(Customer customer,IcreditManager creditmanager) {
		this.customer=customer;
		this.creditmanager=creditmanager;
	}
	public void save() {
		System.out.println("müşteri kaydedildi: "+customer.getFirstName()+"-"+customer.getLastName()+"-"+customer.getNationalidenty());
	}
	public void delete() {
		System.out.println("müşteri kaydedildi: "+customer.getFirstName()+"-"+customer.getLastName()+"-"+customer.getNationalidenty());
	}
	public void giveCredit() {
		creditmanager.calculate();
		System.out.println("kredi verildi");
	}
}
