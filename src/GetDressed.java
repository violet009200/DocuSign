
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Bora Park 
 * @email violet009200@gmail.com
 */

public class GetDressed {
	
	private String temp;
	private String[] command;
	
	GetDressed(String t, String[] com){
		temp = t;
		command = com;
	}
	

	public Temperature getTemperature() {

		
		if(this.temp.equals("HOT")){ //When temperature is HOT

			return new TemperatureHot();
		}
		else if(this.temp.equals("COLD")){ //When temperature is COLD

			return new TemperatureCold();
			
		}
		//incalid input
		else if (this.command.equals(null)){
			System.out.println("fail");
			return null;
		}
		else{ //invalid input
			System.out.println("fail");
			return null;
		}
		
		
	}

}
