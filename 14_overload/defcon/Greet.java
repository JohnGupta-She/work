/*John Gupta-She, Julia Kozak, Kevin Cheng, Po, Flopsy, <unknown ducky name>
APCS
HW14 -- Customize Your Creation
2021-10-7

DISCO
How to overload contructors
QCC
*/

public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib();
		BigSib grizz = new BigSib();
		BigSib dotCom = new BigSib();
		BigSib tracy = new BigSib();
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		greeting = tracy.greet("Dr. Spaceman");
		System.out.println(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.out.println(greeting);
		greeting = dotCom.greet("mom");
		System.out.println(greeting);
	}
}
