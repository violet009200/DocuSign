
import java.util.HashMap;

/*
 * Bora Park 
 * @email violet009200@gmail.com
 * 
 * concrete subclass for HOT
 */

public class TemperatureHot implements Temperature{
	
	
	/*
	 * check if the input is follow the rules
	 * then getCommand then print out all response
	 * @param s command number array
	 */
	public void doPerform(String[] s){
		HashMap hm = new HashMap();
		
		//Pajamas must be taken off before anything else can be put on
		if(!s[0].equals(" 8")){
			System.out.println("fail");
			return;
		}
	
		
		for(int i = 0; i<s.length;i++){
			
			 //You cannot put on a jacket when it is hot
			 		
			if(s[i].equals(" 3") || s[i].equals(" 5")) { 
				Temperature.addOutput("fail");
				break;
			}
			//Check if command input has duplicated number
			//Only 1 piece of each type of clothing may be put on
			else if(hm.containsKey(s[i])){
				Temperature.addOutput("fail");
				break;
			}	
			
			hm.put(s[i], i);
		
			//Pants must be put on before shoes (6,1)
			if(hm.containsKey(" 6") && hm.containsKey(" 1") && ((int)hm.get(" 6") > (int)hm.get(" 1"))){
				Temperature.addOutput("fail");
				break;
			}
			//The shirt must be put on before the headwear(4 or 2)
			else if(hm.containsKey(" 4") && hm.containsKey(" 2") && ((int)hm.get(" 4") > (int)hm.get(" 2"))){
				Temperature.addOutput("fail");
				break;
			}
			//You cannot leave the house until all items of clothing are on (except socks and a jacket when it’s hot)
			else if(s[i].equals(" 7")){
				if(!(hm.containsKey(" 1")&&hm.containsKey(" 2")&&hm.containsKey(" 4")&&hm.containsKey(" 6"))){
					Temperature.addOutput("fail");
					break;
				}
				else {
					getCommand(s[i]);
					break;
				}
			}
			else
				getCommand(s[i]);
		}
		
		Temperature.printResponse();
	}
	


	/*
	 * get response for each command number
	 * @param s input command number
	 */
	public void getCommand(String s){
	
			switch(s){
			
			case " 1": 
				Temperature.addOutput("sandals");
				break;
				
			case " 2": 
				Temperature.addOutput("sun visor");
				break;

			case " 4": 
				Temperature.addOutput("t-shirt");
				break;

			case " 6": 
				Temperature.addOutput("shorts");
				break;
				
			case " 7": 
				Temperature.addOutput("leaving house");
				break;
				
			case " 8": 
				Temperature.addOutput("Removing PJs");
				break;
				
			default: 
				Temperature.addOutput("fail");
				break;
				
			}//switch
		
	}

	

}
