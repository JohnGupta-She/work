/* John Gupta-She, Julia Kozak, Kevin Cheng, Po, Flopsy, <unknown ducky name>
APCS
HW14 -- Customize Your Creation
2021-10-07

DISCO
How to overload contructors
QCC
Why is my Greet printing only Salutations as the helloMsg?
*/

public class BigSib{
	public static String helloMsg;

	public BigSib(){
		setHelloMsg("BRUH");
	}

	public BigSib(String a){
		setHelloMsg(a);
	}

	public static String greet(String a){
		String x = helloMsg + " " + a;
		return x;
	}

	public static void setHelloMsg(String a){
		helloMsg = a;
	}
}
