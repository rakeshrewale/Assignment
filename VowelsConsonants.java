package AssignmentPrograms1;
import java.util.Scanner;

public class VowelsConsonants {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the letter : ");
		
		char ch=scanner.next().charAt(0);
	
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        System.out.println(ch + " is vowel");
    else
        System.out.println(ch + " is consonant");
 
	}
}
