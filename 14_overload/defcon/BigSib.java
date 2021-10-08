/*John Gupta-She, Julia Kozak, Kevin Cheng, Po, Flopsy, <unknown ducky name>
APCS
HW14 -- Customize Your Creation

DISCO
How to overload constructors
QCC
*/

public class BigSib{
	public static String helloMsg;

	public BigSib(){
		setHelloMsg("Hello");
	}

	public static String greet(String a){
		String x = helloMsg + " " + a;
		return x;
	}

	public static void setHelloMsg(String b){
		helloMsg = b;
	}
} 
