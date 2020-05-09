package oOPConceptPart2;

public class TestBank {
	
	//IF a class is implementing any Interface, then its mandatory to define/override all the methods of Interface.
	
	public static void main(String[] args) {
		
		System.out.println(USBank.min_balance);
		
		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.transferMoney();
		hsbc.edicationLoan();
	
		hsbc.carLoan();
		
		
		//dynamic polymorphism
		//child class object can be referred by parent Interface var
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
	}
}
