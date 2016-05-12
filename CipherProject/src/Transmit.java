import java.math.BigInteger;

public class Transmit implements RSA {

	public static BigInteger publicKey = new BigInteger("65537");

	public Transmit() {
	}

	private BigInteger stringConversion(String input) {
		String text = input;
		String number = "";
		for (int i = 0; i < text.length(); i++) {
			number += text.charAt(i) - 22;
		}
		return new BigInteger(number);
	}

	public String decrypt(BigInteger input, BigInteger n) {
		return null;
	}

	public BigInteger encrypt(String input, BigInteger n) {
		BigInteger number = stringConversion(input);
		return number.modPow(publicKey, n);
	}

}
