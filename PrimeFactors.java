package AssignmentPrograms1;

import java.util.Scanner;

	public class PrimeFactors {
		
		public static void main(String args[]){
	     
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      int number = scanner.nextInt();
     
      for(int i = 2; i<=number; i++) 
      {
         while(number%i == 0)           // 20/2 == 0
         {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}