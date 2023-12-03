import java.util.Scanner;

public class BarChartPrintingProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.print("Enter Five Number From 1-30 \n");
	System.out.printf("Enter  first number \n");
		int num1 = input.nextInt();
	System.out.printf("Enter  second number \n");
		int num2 = input.nextInt();
	System.out.printf("Enter  third number \n");
		int num3 = input.nextInt();
	System.out.printf("Enter  forth number \n");
		int num4 = input.nextInt();
	System.out.printf("Enter  fifth number \n");
		int num5 = input.nextInt();

     for(int count =1;count<=num1;count++){
		System.out.print("* ");}
             System.out.println();
	for(int count1=1;count1<=num2;count1++){
			System.out.print("* ");
		}
	System.out.println();	

	for(int count2=1;count2<=num3;count2++){
			System.out.print("* ");
		}
	System.out.println();	

	for(int count3=1;count3<=num4;count3++){
			System.out.print("* ");
		}
	System.out.println();	
	
	for(int count4=1;count4<=num5;count4++){
			System.out.print("* ");
		}
	



	}


}