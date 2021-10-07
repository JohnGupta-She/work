/*John Gupta-She
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-06*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib alien = new BigSib();
    alien.setHelloMsg("Salutations");

    greeting = alien.greet("Dr.Spaceman");
    System.out.println(greeting);

    BigSib DonkeyKong = new BigSib();
    DonkeyKong.setHelloMsg("Hey ya");

    greeting = DonkeyKong.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib me = new BigSib();
    me.setHelloMsg("Sup");

    greeting = me.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet
