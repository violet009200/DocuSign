import java.util.Scanner;

/*
 * Bora Park 
 * @email violet009200@gmail.com
 */

public class GetDressed {
	
	private String temp;
	private String[] command;
	
	private GetDressed(String t, String[] com){
		temp = t;
		command = com;
	}

	public static void main(String[] args) {
		
		//Read input from user
		Scanner sc = new Scanner(System.in);
		String t = sc.next(); //HOT or COLD
				
		String commandNums = sc.nextLine(); //command number
		String[] c = commandNums.split(","); //save each command numbers into array
		
		GetDressed dress = new GetDressed(t,c);
		
		if(dress.temp.equals("HOT")){ //When temperature is HOT
			
			TemperatureHot hot = new TemperatureHot();
			hot.doPerform(dress.command);
			
		}
		else if(dress.temp.equals("COLD")){ //When temperature is COLD
			TemperatureCold cold = new TemperatureCold();
			cold.doPerform(dress.command);;
			
		}
		else{ //invalid command
			System.out.println("fail");
			return;
		}
		
		
	}

}
