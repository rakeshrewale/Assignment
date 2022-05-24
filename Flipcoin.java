package AssignmentPrograms1;
import java .util.Scanner;
public class Flipcoin {

	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int count=1;
		double random=0.0;
		
		System.out.println("Please enter the number : ");
		Scanner scanner=new Scanner(System.in);
		int flips=scanner.nextInt();
		
		while(count<=flips) {
			random=Math.random();
			System.out.println(count+" "+random);
			
			if(random<0.5) {
				heads++;
				System.out.println(" heads ");
			}
			else
			{
				tails++;
				System.out.println(" tails ");
			}
			count++;
		}
		System.out.println();
		System.out.println("Number of Heads :" +heads);
		System.out.println("Number of Tails :" +tails);
		
		double headpercent =(double)heads/flips*100; 
		double tailpercent =(double)tails/flips*100;
		
		System.out.println("Percentage of Heads :" +headpercent);
		System.out.println("Percentage of Tails :" +tailpercent);
	}

}
