import java.math.BigInteger;

public class Transmit implements RSA {

	public BigInteger stringConversion(String input) {
		String text = input;
		String number = "";
		while (text.length() > 0) {
			if (text.charAt(0) != 32)
				number += text.charAt(0) - 47;
			else
				number += 0;
			number += " ";
			text.substring(1);
		}
		return new BigInteger(number);
	}

	public BigInteger encrypt(String input) {
		BigInteger number = stringConversion(input);
		return null;
	}

	public BigInteger decrypt(BigInteger input) {
		return null;
	}

}
