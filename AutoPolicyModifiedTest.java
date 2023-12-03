import java.util.Scanner;

public class AutoPolicyModifiedTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	 AutoPolicyModified autoPolicy1 = new AutoPolicyModified("2234654578","Ford Fusion","ME"); 
	 AutoPolicyModified autoPolicy2 = new AutoPolicyModified("2243567890","Toyota Camry","NJ");

	System.out.print("Enter Your State In it Code (eg New York NY) \n");
		String theState = input.next();
		autoPolicy1.setState(theState);

    	System.out.print("\nEnter Your State In it Code (eg New York NY) \n");
		 theState = input.next();
		autoPolicy2.setState(theState);

   displayAutoPolicyModified(autoPolicy1);
   displayAutoPolicyModified(autoPolicy2);


	}

public static void displayAutoPolicyModified(AutoPolicyModified display){
	System.out.printf("\nAccountNumber: %s%n Car: %s%n State: %s %s a no-fault State%n%n",display.getAccountNumber(),display.getMakeAndModel(), display.getState(),(display.isNoFaultState() ? "is": "is not"));
}





}