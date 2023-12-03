public class ModifiedCompoundInterest{
	public static void main(String[] args){

	int  principal = 1000;
	double rate = 5/100.0;

	System.out.printf("%s%20s%20s\n","Year","Amount On Deposit($ dollars)","Amount Deposit(cents)");

 	for(int year = 1; year<=12;year++){
		int amount = (int)((principal*Math.pow(1+rate,year))*100);
		int dollar = amount/100;
		int cents = amount%100;
	System.out.printf("%4d$%15d%15dcent\n",year,dollar,cents);
	
	}

	}





}