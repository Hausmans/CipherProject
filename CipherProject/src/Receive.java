import java.math.BigInteger;
import java.util.Random;

public class Receive implements RSA {

	private BigInteger p;
	private BigInteger q;
	private BigInteger totient;
	private BigInteger privateKey;

	private BigInteger n;

	public Receive(BigInteger publicKey) {
		privateKey(publicKey);
	}

	private String integerConversion(BigInteger input) {
		String numbers = input.toString();
		String text = "";
		for (int i = 0; i < numbers.length() - 1; i += 2) {
			if (numbers.indexOf("100", i) == i) {
				text += "z";
				i++;
			} else {
				int temp = Integer.parseInt(numbers.substring(i, i + 2));
				text += (char) (temp + 22);
			}
		}
		return text;
	}

	public BigInteger getN() {
		return n;
	}

	private void privateKey(BigInteger publicKey) {
		do {
			p = BigInteger.probablePrime(1000, new Random());
			q = BigInteger.probablePrime(1000, new Random());
			n = p.multiply(q);
			totient = (p.subtract(BigInteger.ONE)).multiply(q
					.subtract(BigInteger.ONE));
		} while (Transmit.publicKey.mod(totient) == BigInteger.ZERO);
		privateKey = publicKey.modInverse(totient);
	}

	public BigInteger encrypt(String input, BigInteger n) {
		return null;
	}

	public String decrypt(BigInteger input, BigInteger n) {
		BigInteger temp = input.modPow(privateKey, n);
		return integerConversion(temp);
	}

}
