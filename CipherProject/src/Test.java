import java.math.BigInteger;

public class Test {

	public static void main(String args[]) {
		Transmit test = new Transmit();
		Receive test2 = new Receive(test.publicKey);
		System.out.println("Hola como estas");
		BigInteger test3 = test.encrypt("Hola como estas", test2.getN());
		System.out.println(test3.toString());
		String test4 = test2.decrypt(test3, test2.getN());
		System.out.println(test4);
	}
}
