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
		}
		else {
			UpFace = "tails";
		}
	}
	
	public String toString(){
		return "Denomination: " + name + " -- " + UpFace;
	}
	
	public boolean equals(Coin a){
		return (UpFace == a.UpFace);
	}
	
	public void assignValue(int a){
		value = a;
	}
}
