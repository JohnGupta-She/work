public class BigSib {
	public static String helloMsg;

	public static String greet(String a){
		String x = helloMsg + " " + a;
		return x;
	}

	public static void setHelloMsg(String b){
		helloMsg = b;
	}
}
