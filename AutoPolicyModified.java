public class AutoPolicyModified{
	private String accountNumber;
	private String makeAndModel;
	private String state;

public AutoPolicyModified(String accountNumber, String makeAndModel, String state){
	this.accountNumber = accountNumber;
	this.makeAndModel= makeAndModel;
	this.state = state;
}

public void setAccountNumber(String accountNumbers){
this.accountNumber = accountNumber;
}

public String getAccountNumber(){
 return accountNumber;
}

public void setMakeAndModel(String makeAndModel){
this.makeAndModel= makeAndModel;
}

public String getMakeAndModel(){
return makeAndModel;
}

public void setState(String state){
if(state.equals("CT") ||state.equals("MA") ||state.equals("ME") ||state.equals("NH") ||state.equals("NJ") ||state.equals("NY") ||state.equals("PA") ||state.equals("VT")){

}
 else {
	System.out.print("Error Message");
}
 this.state = state;
}

public String getState(){
 return state;
}
 public boolean isNoFaultState(){
	boolean noFaultState;
switch(getState()){
	case "Ma":
		noFaultState = true;
	case "NJ":
		noFaultState = true;
	case "NY":
		noFaultState = true;
	case "PA":
		noFaultState = true;
		break;
	default:
		noFaultState = false;
		break;
}
 return noFaultState;
}





}