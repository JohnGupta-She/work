/*
John Gupta-She (Eric He, Po)
APCS
HW23 -- What Does Equality Look Like?
2021-10-24
time spent (outside of class): .4 hours
*/

public class Coin{
	int value;
	String UpFace;
	String name;
	int flipCtr;
	int headsCtr;
	int tailsCtr;
	double bias;

	public static void main(String args[]){
		Coin bob = new Coin();
		Coin blob = new Coin();
		bob.name = "quarter";
		blob.name = "halfdollar";
		bob.flip();
		blob.flip();
		System.out.println(bob.equals(blob));
		System.out.println(bob.toString());
		System.out.println(blob.toString());
	}

	public Coin(){
	}

	public Coin(String a){
		name = a;
	}

	public Coin(String a, String b){
		name = a;
		UpFace = b;
	}

	public void flip(){
		double a = Math.random();
		if (a < bias){
			UpFace = "heads";
			headsCtr = headsCtr + 1;
		}
		else {
			UpFace = "tails";
			tailsCtr = tailsCtr + 1;
		}
		flipCtr = flipCtr + 1;
	}

	public String toString(){
		return "Denomination: " + name + " -- " + UpFace;
	}

	public boolean equals(Coin a){
		return (UpFace == a.UpFace);
	}

	public void assignValue(String a){
		if (a == "penny"){
			value = 1;
		}
		if (a == "nickel"){
			value = 5;
		}
		if (a == "dime"){
			value = 10;
		}
		if (a == "quarter"){
			value = 25;
		}
		if (a == "halfdollar"){
			value = 50;
		}
		if (a == "dollar"){
			value = 100;
		}
	}
}
