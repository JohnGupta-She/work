/*John Gupta-She, Julia Kozak, Kevin Cheng, Po, Flopsy, <unknown ducky name>
APCS
HW14 -- Customize Your Creation
2021-10-7

DISCO
How to overload constructors
QCC
*/

public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib("Word up");
		BigSib grizz = new BigSib("Hey ya");
		BigSib dotCom = new BigSib("Sup");
		BigSib tracy = new BigSib("Salutations");
		greeting = richard.greet("fresman");
		System.out.println(greeting);
		greeting = tracy.greet("Dr. Spaceman");
		System.out.println(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.out.println(greeting);
		greeting = dotCom.greet("mom");
		System.out.println(greeting);
	}
}
