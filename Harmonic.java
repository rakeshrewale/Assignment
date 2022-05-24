package AssignmentPrograms1;
import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		Scanner scanner= new Scanner(System.in);
		
		int num= scanner.nextInt();
		double result=0.0;
		
		System.out.println("The hormonic series is :");
		
		while(num>0) {
			result=result + (double)1/num;
			
			num--;
			System.out.println(result + " ,");
		}
		System.out.println("The hormonic number for given num :"+result);
			
	}

}
