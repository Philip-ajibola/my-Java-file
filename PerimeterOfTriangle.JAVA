import java.util.Scanner;

public class PerimeterOfTriangle{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
   System.out.print("Enter adjacent of the traingle ");   
       int adjacent = input.nextInt();
   System.out.print("Enter  opposite of the traingle ");   
       int opposite = input.nextInt();
   System.out.print("Enter hypothenus of the traingle ");   
       int hypothenus = input.nextInt();

     int perimeter = adjacent + hypothenus + opposite;

   

 if((opposite+adjacent)>hypothenus && (opposite+hypothenus)>adjacent && (hypothenus+adjacent)>opposite){
      System.out.printf("The perimeter of the triangle is: %d",perimeter);
}

if(hypothenus>(opposite+adjacent) || adjacent>(opposite+hypothenus) || opposite>(hypothenus+adjacent)){
      System.out.print("INVALID NUMBER");
   
}




   }




}