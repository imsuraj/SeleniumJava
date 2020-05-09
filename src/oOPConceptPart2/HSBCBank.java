package oOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// we are achieving multiple inheritance
	
	//overriding from USBank
	
	public void credit(){
		System.out.println("hsbc --- credit");
	}
	
	public void debit() {
		System.out.println("hsbc ---- debit");
		
	}
	
	public void transferMoney() {
		System.out.println("hsbc -- transfer money");
	}
	
	//Seperate method of HSBC bank
	public void edicationLoan() {
		System.out.println("hsbc -- education loan");
		
	}
	
	public void carLoan() {
		System.out.println("hsbc--- car loan");
	}

	//overriding from brazilbank
	public void mutualFund() {
		// TODO Auto-generated method stub
		System.out.println("hsbc --- mutual fund");
		
	}


	public void creditCard() {
		// TODO Auto-generated method stub
		System.out.println("hsbc --- credit card");
		
	}
	
	
}
