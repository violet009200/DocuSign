import java.util.HashMap;

/*
 * Bora Park 
 * @email violet009200@gmail.com
 * 
 * concrete subclass for COLD
 */

public class TemperatureCold implements Temperature{


	private int i;
	
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
		
		for(i = 0; i<s.length;i++){
			
			//Check if command input has duplicated number
			//Only 1 piece of each type of clothing may be put on
			if(hm.containsKey(s[i])){
				Temperature.addOutput("fail");
				break;
			}	
			
			hm.put(s[i], i);
			
			//Socks must be put on before shoes(3,1)
			if(hm.containsKey(" 3") && hm.containsKey(" 1") && ((int)hm.get(" 3") > (int)hm.get(" 1"))){
				Temperature.addOutput("fail");
				break;
			}
			//Pants must be put on before shoes (6,1)
			else if(hm.containsKey(" 6") && hm.containsKey(" 1") && ((int)hm.get(" 6") > (int)hm.get(" 1"))){
				Temperature.addOutput("fail");
				break;
			}
			//The shirt must be put on before the headwear(4 or 2,5)
			else if(hm.containsKey(" 4") && hm.containsKey(" 2") && hm.containsKey(" 5") && ((int)hm.get(" 4") > (int)hm.get(" 2")) && ((int)hm.get(" 4") > (int)hm.get(" 5"))){
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
				Temperature.addOutput("boots");
				break;
			case " 2": 
				Temperature.addOutput("hat");
				break;
			case " 3": 
				Temperature.addOutput("socks");
				break;
			case " 4": 
				Temperature.addOutput("shirt");
				break;
			case " 5": 
				Temperature.addOutput("jacket");
				break;
			case " 6": 
				Temperature.addOutput("pants");
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
