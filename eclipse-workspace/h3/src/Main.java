
public class Main {

	public static void main(String[] args) {
	  Customer customer1=new Customer();
	  customer1.setFirstName("sinan");
	  customer1.setLastName("karaoğlu");
	  customer1.setNationalidenty("123456789");
	  customerManager customermanager=new customerManager(customer1,new MilitaryCreditManager());
	  customermanager.save();
	  customermanager.giveCredit();
	  
	  Customer customer2=new Customer();
	  customer2.setFirstName("engin");
	  customer2.setLastName("demiroğ");
	  customer2.setNationalidenty("79876543");
	  customerManager customermanager2=new customerManager(customer2,new TeacherCreditManager());
	  customermanager2.save();
	  customermanager2.giveCredit();
	  }

}
