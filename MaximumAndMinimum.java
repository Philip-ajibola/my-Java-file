import java.util.Scanner;

public class MaximumAndMinimum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	
	System.out.printf("How Many Value times  you want to enter A Value");
	 int num1 = input.nextInt();

	System.out.printf("Enter an integer 1 ");
	 int num = input.nextInt();
 	 
	int maximum = num;
	int minimum = num;
for(int count=2;count<=num1;count++){
	
	System.out.printf("Enter an integer %d ",count);
		 num = input.nextInt();
		 
	 if(num>maximum){
		maximum = num;
	
	}
	 if(num<minimum){
		 minimum = num;
	}	 
}

	
	int sum = maximum + minimum;
	System.out.println("The Maximum Value is "+maximum);
	
	System.out.println("The Minimum Value is "+minimum);
	System.out.print("The Sum Of the Maximum And Minimum is "+sum);


	}





} 