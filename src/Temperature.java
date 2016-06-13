
import java.util.ArrayList;
import java.util.HashMap;


/*
 * Bora Park 
 * @email violet009200@gmail.com
 * 
 * Interface class for TemperatureHot.java TemperatureCold.java
 */

interface Temperature {
	
	ArrayList<String> output = new ArrayList<String>(); //save response
	//HashMap hm = new HashMap();
	
	/*
	 * Print out response from arraylist
	 */
	public static void printResponse(){
		for(int i=0; i< output.size()-1; i++){
			System.out.print(output.get(i)+", ");
		}
		System.out.println(output.get(output.size()-1));
	}
	
	/*
	 * Save response into arraylist
	 * @param s response
	 */
	public static void addOutput(String s){
		output.add(s);
	}
	
	/*
	 * get response for each command number
	 * @param s input command number
	 * Override
	 */
	public void getCommand(String s);
	
	/*
	 * check if the input is follow the rules
	 * then getCommand then print out all response
	 * @param s command number array
	 * Override
	 */
	public void doPerform(String[] s);
	
}
