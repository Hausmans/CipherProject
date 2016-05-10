import java.math.BigInteger;
import java.util.Random;

public class Transmit implements RSA {
	
	private BigInteger p;
	private BigInteger q;
	private BigInteger totient;
	
	public BigInteger n;
	public BigInteger publicKey = new BigInteger("65537");
	
	public Transmit(){
		publicKey();
	}

	public BigInteger stringConversion(String input) {
		String text = input;
		String number = "";
		while (text.length() > 0) {
				number += text.charAt(0) - 22;
			text.substring(1);
		}
		return new BigInteger(number);
	}

	private BigInteger publicKey() {
		p = BigInteger.probablePrime(10000, new Random());
		q = BigInteger.probablePrime(10000, new Random());
		n = p.multiply(q);
		totient = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
		return null;
	}

	public String decrypt(BigInteger input, BigInteger n) {
		return null;
	}

	public BigInteger encrypt(String input) {
		BigInteger number = stringConversion(input);
		return number.modPow(publicKey, n);
	}

}
