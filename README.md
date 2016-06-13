# DocuSign
Software Engineer role interview problem <br />
<br />
This program is written by Bora Park <br />
<br />
Files: README.md, DocuSign.java, GetDressed.java, Temperature.java, TemperatureHot.java, TemperatureCold.java <br />
<br />
HOW TO RUN: <br />
you can simply put all files in the default package in Eclipse and click Run.<br />
The program will read user input from Colsole and print out result into console.<br />
<br />
I use Factory Design Pattern. <br />

DocuSign.java: Main Program.(demo class)<br />
GetDressed.java : Demo class will use GetDressed class to create temperature obeject.<br />
Temperature.java : interface for TemperatureHot.java and TemperatureCold.java<br />
TemperatureHot.java, TemperatureCold.java : concrete subclasses for Temperature.java<br /><br />

Every response will save into arraylist. <br />
Use Hashmap to check the rules ( check if the input is correct )<br /><br />

-----------------------------------------------------------------------------------------------------------------------------------

Test case: <br />
Success<br />
Input: HOT 8, 6, 4, 2, 1, 7<br />
Output: Removing PJs, shorts, t-shirt, sun visor, sandals, leaving house<br />
Input: COLD 8, 6, 3, 4, 2, 5, 1, 7<br />
Output: Removing PJs, pants, socks, shirt, hat, jacket, boots, leaving house<br />
 <br />
Failure<br />
Input: HOT 8, 6, 6<br />
Output: Removing PJs, shorts, fail<br />
Input: HOT 8, 6, 3<br />
Output: Removing PJs, shorts, fail<br />
Input: COLD 8, 6, 3, 4, 2, 5, 7<br />
Output: Removing PJs, pants, socks, shirt, hat, jacket, fail<br />
Input: COLD 6<br />
Output: fail<br />
