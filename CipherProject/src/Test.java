import java.math.BigInteger;


public class Test {

	public static void main (String args[] ){
		Transmit test = new Transmit();
		Receive test2 = new Receive(test.publicKey);
		BigInteger test3 = test.encrypt("Hi", test2.getN());
		System.out.println(test3.toString());
		System.out.println(test2.decrypt(test3, test2.getN()));
	}
}
