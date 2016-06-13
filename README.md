# DocuSign
Software Engineer role interview problem

This program is written by Bora Park

Files: README.md, DocuSign.java, GetDressed.java, Temperature.java, TemperatureHot.java, TemperatureCold.java

HOW TO RUN: 
you can simply put all files in the default package in Eclipse and click Run.
The program will read user input from Colsole and print out result into console.

I use Factory Design Pattern. 

DocuSign.java: Main Program.(demo class)
GetDressed.java : Demo class will use GetDressed class to create temperature obeject.
Temperature.java : interface for TemperatureHot.java and TemperatureCold.java
TemperatureHot.java, TemperatureCold.java : concrete subclasses for Temperature.java

Every response will save into arraylist. 
Use Hashmap to check the rules ( check if the input is correct )

-----------------------------------------------------------------------------------------------------------------------------------

Test case:
Success
Input: HOT 8, 6, 4, 2, 1, 7
Output: Removing PJs, shorts, t-shirt, sun visor, sandals, leaving house
Input: COLD 8, 6, 3, 4, 2, 5, 1, 7
Output: Removing PJs, pants, socks, shirt, hat, jacket, boots, leaving house
 
Failure
Input: HOT 8, 6, 6
Output: Removing PJs, shorts, fail
Input: HOT 8, 6, 3
Output: Removing PJs, shorts, fail
Input: COLD 8, 6, 3, 4, 2, 5, 7
Output: Removing PJs, pants, socks, shirt, hat, jacket, fail
Input: COLD 6
Output: fail
