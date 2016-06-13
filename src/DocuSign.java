import java.util.Arrays;
import java.util.Scanner;

/*
 * Bora Park 
 * @email violet009200@gmail.com
 * 
 * Main class
 */


public class DocuSign {

	public static void main(String[] args) {
		//Read input from user
		Scanner sc = new Scanner(System.in);
		String t = sc.next(); //HOT or COLD
				
		String commandNums = sc.nextLine(); //command number
		String[] c = commandNums.split(","); //save each command numbers into array
		
		GetDressed dress = new GetDressed(t,c);
		
		Temperature temperature = dress.getTemperature();
		
		//invalid input check
		if(temperature == null){
				return;
		}
		else temperature.doPerform(c);
		
	}

}
