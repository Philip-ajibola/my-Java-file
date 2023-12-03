public class DiamondPrintingProgram{
	public static void main(String[] args){
		
	for(int count = 1; count<=10; count++){							for(int counter =10; counter>=count;counter--){
			System.out.print(" ");
		}
			for(int count1=1;count1<=count;count1++){
			System.out.print("* ");

			}
			System.out.println();
	}
	  
	for(int count2 = 1;count2<=10;count2++){
			System.out.print(" ");
		for(int count3 = 1;count3<=count2;count3++){
			System.out.print(" ");
				}
		for(int count4 = 9; count4>= count2;count4--){
			System.out.print("* ");

		}
		System.out.println();



		}


	}







}